package pl.caloriapp.item;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import pl.caloriapp.product.Product;
import pl.caloriapp.product.ProductDao;
import pl.caloriapp.user.CurrentUser;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    private final ItemDao itemDao;
    private final ProductDao productDao;

    public ItemController(ItemDao itemDao, ProductDao productDao){
        this.itemDao = itemDao;
        this.productDao = productDao;
    }

    @GetMapping // wyswietlam wszystkie Item'y
    public String items(@AuthenticationPrincipal CurrentUser currentUser, Model model) {
        Long userId = currentUser.getUser().getId();
        model.addAttribute("items",itemDao.getAllByUserId(userId));
        return "item/items";
    }

    @GetMapping("/add")
    public String itemAdd(@AuthenticationPrincipal CurrentUser currentUser, Model model) {
        Item item = new Item(); // tworzenie nowego obiektu Item
        item.setDate(new java.sql.Date(System.currentTimeMillis())); // przypisanie daty aktualnej
        item.setUser(currentUser.getUser()); // przypisanie user'a do itemu
        item.setQuantity(BigDecimal.ONE); // wypelnienie na 1
        item.setWeight(BigDecimal.ONE);
        model.addAttribute("item", item); // przekazanie Item'u do widoku (jsp)
        return "item/add";
    }
    @PostMapping("/add")
    public String itemAdd(@Valid @ModelAttribute Item item, BindingResult result) {
        if(result.hasErrors()){
            return "item/add";
        }
        Product product = productDao.getById(item.getProduct().getId()); //szukanie calego produktu w bazie po id z formularza
        BigDecimal calorie = item.getQuantity().multiply(((product.getCalorie().divide(product.getWeight())).multiply(item.getWeight())));
        item.setCalorie(calorie);
        itemDao.save(item);
        return "redirect:/items";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("item", itemDao.getById(id));
        return "item/edit";
    }
    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute Item item, BindingResult result) {
        if(result.hasErrors()){
            return "item/edit";
        }
        Product product = productDao.getById(item.getProduct().getId());
        BigDecimal calorie = item.getQuantity().multiply(((product.getCalorie().divide(product.getWeight())).multiply(item.getWeight())));
        item.setCalorie(calorie);
        itemDao.update(item);
        return "redirect:/items";
    }

    @GetMapping("/delete/{id}")
    public String edit(@PathVariable Long id) {
        itemDao.delete(itemDao.getById(id));
        return "redirect:/items";
    }

    @ModelAttribute("timeOfDays")
    public List<TimeOfDay> timeOfDays() {
        return Arrays.asList(
                new TimeOfDay(0,"SNIADANIE"),
                new TimeOfDay(1,"SNIADANIE II"),
                new TimeOfDay(2,"OBIAD"),
                new TimeOfDay(3,"PODWIECZOREK"),
                new TimeOfDay(4,"KOLACJA")
        );
    }

    @ModelAttribute("products")
    public List<Product> products(){
        return productDao.getAll();
    }
}

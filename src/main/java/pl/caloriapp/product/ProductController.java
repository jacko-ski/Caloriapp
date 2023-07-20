package pl.caloriapp.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao){
        this.productDao = productDao;
    }
    
    @GetMapping
    public String products(Model model) {
        model.addAttribute("products", productDao.getAll());
        return "product/products";
    }

    @GetMapping("/add")
    public String productAdd(Model model){
        model.addAttribute("product",new Product());
        return "product/add";
    }
    @PostMapping("/add")
    public String productAdd(@Valid @ModelAttribute Product product, BindingResult result){
        if(result.hasErrors()){
            return "product/add";
        }
        productDao.save(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("product", productDao.getById(id));
        return "product/edit";
    }
    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute Product product, BindingResult result) {
        if(result.hasErrors()){
            return "product/edit";
        }
        productDao.update(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String edit(@PathVariable Long id) {
        productDao.delete(productDao.getById(id));
        return "redirect:/products";
    }
}

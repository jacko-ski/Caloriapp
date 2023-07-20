package pl.caloriapp.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home/home";
    }
}




// jaką ma dać warotść
// encje wszystkie
// crud - operacje do wypełniania danych
//-create
//-read
//-update
//-delete
// analityke - widoki
//

// -------------------------------
// CZAS

//    https://thorben-janssen.com/hibernate-5-date-and-time/
//    Product e = new Product();
//e.setDateTime(LocalDateTime.now());


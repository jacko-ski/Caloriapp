package pl.caloriapp.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "user/login";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user",new UserApp());
        return "user/register";
    }
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") UserApp user, BindingResult result){
        if(result.hasErrors()){
            return "user/register";
        }
        userService.saveUser(user);
        return "redirect:/login";
    }
}

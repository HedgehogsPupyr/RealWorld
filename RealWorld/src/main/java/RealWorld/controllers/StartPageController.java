package RealWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartPageController {
    @GetMapping("/")
    public String startPage (Model model) {
        return "startPage";
    }

    @GetMapping("/main")
    public String maunPage (){
        return "main";
    }

    @GetMapping("/login")
    public String loginPage () {
        return "login";
    }

}

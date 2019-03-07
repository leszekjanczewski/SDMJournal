package pl.leszekjanczewski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

//    @Autowired
//    UserRepo userRepo;

    @GetMapping
    @ResponseBody
    public String userAddForm() {
        return "home";
    }
}

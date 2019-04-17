package pl.leszekjanczewski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.leszekjanczewski.repository.UserRepo;

import javax.validation.Validator;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @GetMapping(value = "/login", produces = "text/html; charset=UTF-8")
    public String login() {
        return "login";
    }

    /*@PostMapping("/login")
    public String loginCheck(@Valid User user, BindingResult result, @ModelAttribute User userForm) {
        if (result.hasErrors()) {
            return "/login";
        }
        userRepo.findOne(userForm.getUserId());
        return "redirect:/login";
    }*/
}

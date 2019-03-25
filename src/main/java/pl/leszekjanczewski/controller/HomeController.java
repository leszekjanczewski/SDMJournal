package pl.leszekjanczewski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.leszekjanczewski.model.User;
import pl.leszekjanczewski.repository.UserRepo;

import javax.validation.Valid;
import javax.validation.Validator;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    Validator validator;

    @Autowired
    UserRepo userRepo;

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @GetMapping(value = "/login", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String login() {
        return "<h1>Tytuł</h1>";
    }

    @PostMapping("/login")
    public String loginCheck(@Valid User user, BindingResult result, @ModelAttribute User userForm) {
        if (result.hasErrors()) {
            return "/login";
        }
        userRepo.findOne(userForm.getUserId());
        return "redirect:/login";
    }
}

package pl.leszekjanczewski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

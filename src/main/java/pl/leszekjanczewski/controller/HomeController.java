package pl.leszekjanczewski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @GetMapping(value = "/login", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String login() {
        return "<h1>Tytuł</h1>";
    }
}

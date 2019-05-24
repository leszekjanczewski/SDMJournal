package pl.leszekjanczewski.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Secured("ROLE_ADMIN")
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("addUser")
    public String addUser() {
        return "/admin/addUser";
    }

    @PostMapping
    public void addUserSave(ModelAndView modelAndView) {

    }
}

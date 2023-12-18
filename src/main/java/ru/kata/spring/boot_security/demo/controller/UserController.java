package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.security.PersonDetails;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    public UserController() {

    }

    @GetMapping("/user")
    public String userPage(Model model, Authentication authentication) {
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        model.addAttribute("user", personDetails.getUser());
        return "user";
    }

    @GetMapping("/user/logout")
    public String logout(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            request.getSession().invalidate();
        }
        return "redirect:/login";
    }
}

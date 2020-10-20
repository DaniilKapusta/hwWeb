package com.example.hwWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowFormsController {
    @GetMapping("/showForms")
    public String showForms() {
        return "showForms.html";
    }
}

package pl.coderslab.workshop5.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @GetMapping("")
    @ResponseBody
    public String main() {
        return "Aplikacja działa :)";
    }
}

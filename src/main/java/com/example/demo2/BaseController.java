package com.example.demo2;

import com.example.demo2.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BaseController {
    @GetMapping("/")
    public String home(@ModelAttribute Person person) {
      return "form";
    }

    @PostMapping("/form")
    public String result(@ModelAttribute Person person){
        return "result";
    }
}

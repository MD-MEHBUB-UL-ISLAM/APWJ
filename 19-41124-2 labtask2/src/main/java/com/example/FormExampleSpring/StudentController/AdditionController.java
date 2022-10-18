package com.example.FormExampleSpring.StudentController;


import com.example.FormExampleSpring.domain.Addtion;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class AdditionController
{
    @GetMapping("/index")
    public String ViewForm(Model model)
    {
        model.addAttribute("Addition", new Addtion());
        return "index";
    }

    @PostMapping("/addtion")
    public String addForm(@ModelAttribute Addtion addtion, BindingResult result, Model model)
    {
        model.addAttribute("addtion",addtion);
        return "calculate";
    }
}

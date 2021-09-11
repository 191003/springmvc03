package com.zking.controller.demo;

import com.zking.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class Login {

    @RequestMapping("/login")
    public String login(@Validated User user, BindingResult rest, Model model){
        if(rest.hasErrors()){
            List<FieldError> list = rest.getFieldErrors();
            Map<String,String> map=new HashMap<>();
            for (FieldError fieldError : list) {
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            model.addAttribute("map",map);


            return "i18n";
        }
        System.out.println("登录");
        return "hello";
    }
}

package com.zking.controller.demo;



import com.zking.model.User;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/*
* @Service(业务逻辑层)
*@Repository(数据访问层)
* @Controller（组件）
* */


@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }


    @ResponseBody
    @RequestMapping("/test1")
    public String test1(String name,Integer age){
        System.out.println(name);
        System.out.println(age);

        return "ok";
    }



    @ResponseBody
    @RequestMapping("/test2")
    public String test2(User user){
        System.out.println(user.getUsername());
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/test3")
    public String test3(@RequestParam String name, Integer age){
        System.out.println(name);
        System.out.println(age);

        return "ok";
    }

    @ResponseBody
    @RequestMapping("/test4")
    public String test4(@RequestParam(required = false,defaultValue = "哦哦") String name, Integer age){
        System.out.println(name);
        System.out.println(age);

        return "ok";
    }

    @ResponseBody
    @RequestMapping("/test5")
    public String test5(Integer [] id){
        for (Integer integer : id) {
            System.out.println(integer);
        }

        return "ok";
    }


    @RequestMapping("/read")
    public String read(){


        return "redirect:/demo/hello";
    }


    @RequestMapping("/test6")
    public ModelAndView test6(){
    ModelAndView mv=new ModelAndView();
    mv.addObject("msg","ppp");
    mv.setViewName("hello");

        return mv;
    }
}

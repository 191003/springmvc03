package com.zking.controller.demo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/demo")
public class test {
    @RequestMapping("/demo1")
    public String demo1(){
        return "demo";
    }



    //数据格式化
    @RequestMapping("/demo2")
    public String demo2(@DateTimeFormat(pattern="yyyy-MM-dd") Date data){
      //  System.out.println(data.toLocaleString());
        return "demo";
    }

    //文件上传
    @RequestMapping("/demo3")
    public String demo3(HttpServletRequest ques,String name, MultipartFile i){
        String filename = i.getOriginalFilename();//原文件名
       String s= ques.getSession().getServletContext().getRealPath("/statics/upload");

       String newFile= UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
        File f=new File(s+"/"+newFile);

        try {
            i.transferTo(f);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println(newFile);
        System.out.println(filename);
        System.out.println(name);
        return "user_reg";
    }

    @RequestMapping("/reg")
    public String reg(){
        return "user_reg";
    }


    @RequestMapping("/demo4")
    public String demo4(@ModelAttribute User user, Model model){
        String[] allLoves = {"吃饭","睡觉","打豆豆"};
        List<City> cityList = new ArrayList<>();
        cityList.add(new City(1,"长沙"));
        cityList.add(new City(2,"湘潭"));
        model.addAttribute("allLoves",allLoves);
        model.addAttribute("cityList",cityList);
        return "demo4";
    }
}

package com.zking.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
@RequestMapping("/i18n")
public class I18N {

            @RequestMapping("/test1")
            public String test1(){
                return "i18n";
    }

    @RequestMapping("/change")
    public String change(String lang, HttpSession session){
           if(lang.equals("zh")){
               Locale locale=new Locale("zh","CN");
               session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale);
           }else if(lang.equals("en")){
               Locale locale=new Locale("en","US");
               session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale);
           }else {
               session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.getDefault());
           }

        return "i18n";
    }



}
package com.zking.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, java.lang.Exception e) {
        if(e instanceof Exception){

        }
ModelAndView mv=new ModelAndView();
        mv.setViewName("error");
        return mv;
    }
}

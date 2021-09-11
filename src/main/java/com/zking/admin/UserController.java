package com.zking.admin;

import com.zking.model.User;
import com.zking.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @RequestMapping("list")
    @ResponseBody
    public AjaxResult list(User user){
        AjaxResult ar=new AjaxResult();
        return ar;

    }
}

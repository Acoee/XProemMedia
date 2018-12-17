package com.xproem.media.portal;

import com.xproem.media.po.UserPO;
import com.xproem.media.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "index.html")
    public ModelAndView index() {
        List<UserPO> userPOList = userService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("userList", userPOList);
        return modelAndView;
    }
}

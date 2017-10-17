package com.osight.music.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.osight.music.pojo.UserData;
import com.osight.music.service.UserService;

/**
 * @author chenw <a href="mailto:chenw@chsi.com.cn">chen wei</a>
 * @version $Id$
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserData user = new UserData();
        user.setUsername(username);
        user.setPassword(password);
        boolean result = userService.login(user);

        if (result) {
            return "/user/success";
        } else {
            return "/user/fail";
        }
    }
}

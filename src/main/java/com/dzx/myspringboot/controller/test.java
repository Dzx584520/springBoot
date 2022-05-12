package com.dzx.myspringboot.controller;

import com.dzx.myspringboot.dao.UserDao;
import com.dzx.myspringboot.entity.User;
import com.dzx.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class test {
    @Autowired
    private UserService userService;

    @RequestMapping("/api/test")
    public List<User> test(){
        List<User> user = userService.findAllUser();
        user.stream().filter(t -> t.getName() != null).forEach(t -> System.out.println(t));

        return userService.findAllUser();
    }


}

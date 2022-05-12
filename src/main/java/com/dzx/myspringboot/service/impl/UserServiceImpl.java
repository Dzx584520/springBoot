package com.dzx.myspringboot.service.impl;

import com.dzx.myspringboot.dao.UserDao;
import com.dzx.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List findAllUser() {
        return userDao.findAllUser();
    }
}

package com.dzx.myspringboot.dao;

import com.dzx.myspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {
    public List<User> findAllUser();
}

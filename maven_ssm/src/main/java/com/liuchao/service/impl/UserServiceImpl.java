package com.liuchao.service.impl;

import com.liuchao.dao.UserDao;
import com.liuchao.domain.User;
import com.liuchao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findById(int id) {

        return userDao.findById((long)id);
    }
}

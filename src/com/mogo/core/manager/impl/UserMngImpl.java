package com.mogo.core.manager.impl;

import com.mogo.core.entity.User;
import com.mogo.core.manager.UserMng;
import com.mogo.core.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2016/7/6.
 */


@Service
public class UserMngImpl implements UserMng{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserList(String id) {
        return userMapper.getUserList(id);
    }

    @Override
    public List<User> getAllUserList(){
        return userMapper.getAllUserList();
    }

    @Override
    public int insertUser(User user){
        return userMapper.add(user);
    }

    @Override
    public  int updateUser(User user){
        return userMapper.update(user);
    }

    @Override
    public int delUser(String id){
        return userMapper.deleteById(id);
    }
}

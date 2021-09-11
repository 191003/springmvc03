package com.zking.service.impl;

import com.zking.mapper.UserMapper;
import com.zking.model.User;
import com.zking.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public int deleteByPrimaryKey(Long userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> list(User user) {
        return userMapper.list(user);
    }

    @Override
    public List<User> load(String name) {
        return userMapper.load(name);
    }

    @Override
    public List<User> listById(Integer id) {
        return userMapper.listById(id);
    }
}

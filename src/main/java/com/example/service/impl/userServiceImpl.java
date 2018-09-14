package com.example.service.impl;


import com.example.dao.UserMapper;

import com.example.model.User;
import com.example.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserServices")
public class userServiceImpl extends SqlSessionDaoSupport implements UserService{


    @Override
    @Resource
    public void setSqlSessionFactory(@Qualifier("sqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    @Resource
    private UserMapper userMapper;

    public  int add(User user){

        int result = userMapper.insert(user);
        return result;
    }
}

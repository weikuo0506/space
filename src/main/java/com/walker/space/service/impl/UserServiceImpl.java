package com.walker.space.service.impl;

import com.walker.space.dao.UserMapper;
import com.walker.space.domain.User;
import com.walker.space.domain.UserExample;
import com.walker.space.service.UserService;
import com.walker.space.util.IDConstants;
import com.walker.space.util.IDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wk on 2015/12/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveUser(User user) {
        long id = IDUtil.generateID(IDConstants.USER_TABLE_ID);
        user.setUserId(id);
        userMapper.insertSelective(user);
    }

    @Override
    public List<User> getUsers() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(long id) {
        userMapper.deleteByPrimaryKey(id);
    }
}

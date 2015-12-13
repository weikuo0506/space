package com.walker.space.service;

import com.walker.space.domain.User;

import java.util.List;

/**
 * Created by wk on 2015/12/3.
 */
public interface UserService {
    User getUserById(long id);
    void saveUser(User user);
    List<User> getUsers();
    void updateUser(User user);
    void deleteUser(long id);
}

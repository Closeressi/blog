/**
 * FileName: UserServiceImpl
 * Author:   closesi
 * Date:     2021/3/30 15:23
 * Description:
 */
package com.closesi.service;

import com.closesi.dao.UserRepository;
import com.closesi.po.User;
import com.closesi.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}

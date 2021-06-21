/**
 * FileName: UserService
 * Author:   closesi
 * Date:     2021/3/30 15:25
 * Description:
 */
package com.closesi.service;

import com.closesi.po.User;

public interface UserService {

    User checkUser(String username, String password);
}

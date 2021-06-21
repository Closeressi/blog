/**
 * FileName: UserRepository
 * Author:   closesi
 * Date:     2021/3/30 15:30
 * Description:
 */
package com.closesi.dao;

import com.closesi.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}

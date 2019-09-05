package com.example.repository;


import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2018/3/23.
 *
 * @author zlf
 * @since 1.0
 */

public interface UserRepository extends JpaRepository<User,Integer> {
}

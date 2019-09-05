package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;


public interface UserService {

  User getUserById(Integer id);


}

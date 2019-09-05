package com.example.web;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/test")
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    User index(Integer id) {


        return userService.getUserById(id);
    }
}

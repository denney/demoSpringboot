package com.example.model;

import org.junit.Test;

public class UserTest {
    /**
     * 测试lombok   @data 注解和 @build注解
     */
    @Test
    public void test() {
        User user = User.builder().id(1).name("222").build();

        System.out.println(user.toString());
    }


}
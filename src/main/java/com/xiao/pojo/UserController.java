package com.xiao.pojo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    public IMoocJSONResult getUser(){
        User u = new User();
        u.setAge(20);
        u.setBirthday(new Date());
        //u.setDesc("这是一个陷阱");
        u.setName("张晓明");
        u.setPassword("123456");
        return IMoocJSONResult.ok(u);
    }
}

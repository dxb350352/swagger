package com.dxb.swagger.controller;

import com.dxb.swagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户服务", tags = "用户服务接口")
public class UserController {
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ApiOperation(value = "用户登陆")
    public User login(@ApiParam(value = "用户名", required = true) @RequestParam(required = true) String userName,
                      @ApiParam(value = "密码", required = true) @RequestParam(required = true) String password) {
        if ("root".equals(userName)) {
            return new User(userName, password);
        } else {
            return new User();
        }
    }

    @RequestMapping(value = "/logout", method = {RequestMethod.GET})
    public String logout(@RequestParam(required = true) String userName) {
        return "logout:" + userName;
    }
}

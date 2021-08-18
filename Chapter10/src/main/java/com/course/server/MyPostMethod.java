package com.course.server;

import com.course.been.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/7/9 8:59 下午
 */

@RestController
@Api(value = "/",description = "这是我全部的post请求")
@RequestMapping("/")
public class MyPostMethod {
    //这个变量用来装我们cookies信息
    private static Cookie cookie;
    //用户登录成功获取cookies,然后再访问其他接口获取列表
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功获取cookies信息",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "username",required = true) String userName,
                        @RequestParam(value = "password",required = true) String Password){
        if (userName.equals("zhangsan") && Password.equals("123456")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "恭喜你登录成功";
        }
        return "用户名或者密码错误";

    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User u){
        User user;
        //获取cookies
        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
        for (Cookie c :cookies){
            if (c.getName()=="login"
                    && c.getValue()=="true"){

                user = new User();

                return user.toString();

            }
        }
            return "参数不合法";





    }
}

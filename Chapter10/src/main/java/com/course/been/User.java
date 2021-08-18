package com.course.been;

import lombok.Data;
import springfox.documentation.service.ApiListing;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/7/9 9:45 下午
 */
@Data
public class User {
    private String UserName;
    private String password;
    private String name;
    private String age;
    private String sex;


}

package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/17 3:14 上午
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + "; age = " + age);
    }
}

package com.course.testng;

import org.testng.annotations.*;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/16 11:09 下午
 */
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("afterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是类之后运行的");
    }

    @BeforeSuite
    public void beforeSUite(){
        System.out.println("beforeSuite这是测试套间");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite这是测试套间");
    }
}

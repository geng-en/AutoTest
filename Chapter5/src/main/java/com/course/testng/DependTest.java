package com.course.testng;

import org.testng.annotations.Test;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/17 3:08 上午
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}

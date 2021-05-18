package com.course.testng;

import jdk.nashorn.internal.AssertsEnabled;
import org.testng.annotations.Test;
import test.enable.EnableTest;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/17 12:28 上午
 */
public class ignoreTest {

    @Test
    public void ignore1(){
        System.out.println("igonre1 执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}

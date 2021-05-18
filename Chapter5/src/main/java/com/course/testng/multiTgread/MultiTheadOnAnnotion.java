package com.course.testng.multiTgread;

import org.testng.annotations.Test;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/18 9:06 下午
 */
public class MultiTheadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        //System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}

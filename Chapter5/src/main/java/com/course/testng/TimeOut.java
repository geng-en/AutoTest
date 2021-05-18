package com.course.testng;

import org.testng.annotations.Test;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/18 10:44 下午
 */
public class TimeOut {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFaalied() throws InterruptedException{
        Thread.sleep(3000);
    }
}

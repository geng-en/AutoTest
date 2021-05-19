package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/17 2:26 上午
 */

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass1中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass1中的teacher2运行");
    }

}

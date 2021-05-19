package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/17 2:25 上午
 */

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行");
    }
}

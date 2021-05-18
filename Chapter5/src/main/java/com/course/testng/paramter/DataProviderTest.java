package com.course.testng.paramter;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/17 3:32 上午
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name + "; age = " + age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsna",10},
                {"lisi",20},
                {"wangwu",30}

        };
        return o;
    }





    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name="+name+"；age="+age);
    }


    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name="+name+"；age="+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsna",20},
                    {"lisi",25}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",55}
            };
        }
        return result;

    }
}

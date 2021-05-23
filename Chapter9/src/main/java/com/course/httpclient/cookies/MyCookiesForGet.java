package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.omg.IOP.ExceptionDetailMessage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 类功能描述
 *
 * @Author gengen
 * @Date 2021/5/21 9:40 下午
 */
public class MyCookiesForGet {
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;


    @BeforeTest
    public void beforeTest(){
        bundle= ResourceBundle.getBundle("application", Locale.CHINA);
        url= bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        String result;
  //  从配置文件中拼接测试的url
        String uri = bundle.getString("getCookies.uri");
        String testurl = this.url+uri;

  //  接口测试用例代码书写
        HttpGet get = new HttpGet(testurl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
  //  获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for (Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = " + name + "; cookie value = " + value);
        }
    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookie() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        String testurl = this.url+uri;
        HttpGet get = new HttpGet(testurl);
        DefaultHttpClient client = new DefaultHttpClient();
 //   设置cookies信息
        client.setCookieStore(this.store);
        System.out.println(this.store);
        HttpResponse response = client.execute(get);
 //   获取响应的状态码
        int statuscode = response.getStatusLine().getStatusCode();
        System.out.println("statuscode = " + statuscode);
        if (statuscode == 200){
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }else{
           System.out.println("返回状态码不对,请求失败");
            throw new RuntimeException(){

            };
        }
}


}

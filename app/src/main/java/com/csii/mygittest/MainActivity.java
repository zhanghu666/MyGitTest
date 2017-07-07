package com.csii.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static String Ip = null;

    static {
        //Ip = "https://jlmcweb.chinabond.com.cn/Product_pweb/";
        //Ip = "http://10.1.1.15:8090/paygate/weixin";
        //Ip = "http://10.1.1.194:8090/paygate/weixin";
        Ip = "https://wxhj.csii.com.cn/paygate/weixin";//生产地址
        //Ip = "http://115.182.90.201/paygate/weixin";
        //Ip = "http://devwx.csii.com.cn/paygate/weixin";//测试环境
    }

    public static JSONObject userInfo = new JSONObject();
    public static JSONObject loginInfo;//存储登陆信息（这个好用）

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("我是功能1");
        System.out.println("我是功能2");
        System.out.println("我是功能4");
    }
}

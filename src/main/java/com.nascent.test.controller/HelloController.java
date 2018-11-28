package com.nascent.test.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.paragetter.Para;
import com.jfinal.kit.PropKit;
import com.nascent.test.po.User;

public class HelloController extends Controller {
    public void index(@Para("") User user) {
        System.out.println("测试成功！！！"+PropKit.use("test.txt").get("port"));
        System.out.println(user.toString());
        // 测试getPara("")方法
        System.out.println(getPara("username"));
        // 测试getParaToInt("")方法
        System.out.println(getParaToInt("age"));
        // 测试getPara(index)方法 注意解析的是para1-para2-para3  以"-"分隔的参数
        System.out.println(getPara(2));
        // 测试getModel(Model.class,"参数前缀名")
       // System.out.println(getModel(User.class,"user"));
        User user1 = new User();
        user1.setUsername("小汪");
        user1.setAge(3);
        user1.setAddress("湖口");
        setAttr("user",user1);
    }
}

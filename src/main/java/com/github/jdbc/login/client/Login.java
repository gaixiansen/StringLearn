package com.github.jdbc.login.client;


import com.github.jdbc.entity.User;
import com.github.jdbc.login.service.DoLogin;
import com.mysql.jdbc.StringUtils;

import java.util.Scanner;

/**
 * 相当于前台界面的角色，从这里获取form表单中用户的信息
 */
public class Login {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String passwd = sc.nextLine();
            // 调用在数据库中查找用户的方法
            User user = DoLogin.findUser(name, passwd);
            if (user != null){
                System.out.println("欢迎您：" + user);
                System.exit(0);
            }else{
                System.out.println("输入的用户名或密码不正确,还有"+(3-i-1)+"次输入机会");
            }
        }

    }
}

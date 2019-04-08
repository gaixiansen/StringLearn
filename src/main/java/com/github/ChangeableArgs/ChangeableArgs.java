package com.github.ChangeableArgs;

/**
 * @ Author: 瞎驴
 * @ description:可变参数的传递
 * @ Date: 2019/4/8 22:18
 * @ Version 1.0
 */
public class ChangeableArgs {
    public static void main(String[] args) {
        print("a", 1,2,3);
    }

    public static void print(String a, int ...args){
        System.out.println(a);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}

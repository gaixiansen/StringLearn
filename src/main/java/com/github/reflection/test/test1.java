package com.github.reflection.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/github/reflection/test/config.properties"));//创建输入流关联xxx.properties
        Class<?> aClass = Class.forName(br.readLine());//读取配置文件中类名,获取字节码对象
        DemoClass o = (DemoClass) aClass.newInstance();	//通过字节码对象创建对象
        o.run();


    }
}

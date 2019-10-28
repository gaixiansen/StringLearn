package com.github.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * //动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，
 * 实现invoke方法。该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类
 */
public class MyProx implements InvocationHandler {
    // 目标对象
    private Object targetObject;
    //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
    public MyProx(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * 关联的这个实现类的方法被调用时将被执行InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("安全校验");
        method.invoke(targetObject, args);
        System.out.println("日志打印");
        return null;
    }
}

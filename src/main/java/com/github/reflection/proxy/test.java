package com.github.reflection.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 其实所谓代理，就是一个人或者一个机构代表另一个人或者另一个机构采取行动。在一些情况下，一个客户不想或者不能够直接引用一个对象，
 * 而代理对象可以在客户端和目标对象之前起到中介的作用。代理对象就是把被代理对象包装一层，在其内部做一些额外的工作，比如用户需要
 * 上facebook,而普通网络无法直接访问，网络代理帮助用户先翻墙，然后再访问facebook。这就是代理的作用了。纵观静态代理与动态代理，
 * 它们都能实现相同的功能，而我们看从静态代理到动态代理的这个过程，我们会发现其实动态代理只是对类做了进一步抽象和封装，使其复
 * 用性和易用性得到进一步提升而这不仅仅符合了面向对象的设计理念，其中还有AOP的身影，这也提供给我们对类抽象的一种参考。关于动态
 * 代理与AOP的关系，个人觉得AOP是一种思想，而动态代理是一种AOP思想的实现！
 */
public class test {
    /**
     * 被代理对象targetObject通过参数传递进来，我们通过targetObject.getClass().getClassLoader()获取ClassLoader对象，
     * 然后通过targetObject.getClass().getInterfaces()获取它实现的所有接口，然后将targetObject包装到实现了InvocationHandler接口
     * 的LogHandler对象中。通过newProxyInstance函数我们就获得了一个动态代理对象。
     */
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl(); //代理只能针对接口
        MyProx myProx = new MyProx(student);
        //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象
        // 也可以将这个方法写到MyProx中去
        Student sp = (Student) Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), myProx);
        sp.login();
        System.out.println("------------------------------");
        sp.submit();

    }
}

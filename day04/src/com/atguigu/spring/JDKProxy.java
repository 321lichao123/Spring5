package com.atguigu.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName JDKProxy
 * @Description
 * @Author 12468
 * @Date 2021/12/13 20:46
 * @Version 1.0
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao o = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = o.add(1, 2);
        System.out.println("add = " + add);
    }
}

class UserDaoProxy implements InvocationHandler {

    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强逻辑之前执行
        System.out.println("增强之前的方法...." + method.getName() + "参数是...." + Arrays.toString(args));
        Object invoke = method.invoke(object, args);
        // 增强逻辑之后执行
        System.out.println("增强之后的方法" + object);
        return invoke;
    }
}

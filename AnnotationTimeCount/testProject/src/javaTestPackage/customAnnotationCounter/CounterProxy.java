package javaTestPackage.customAnnotationCounter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class CounterProxy implements InvocationHandler {

    private Object object;

    private CounterProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.isAnnotationPresent(CounterForMethod.class)) {

            long before = System.currentTimeMillis();
            Object returnObj = method.invoke(object, args);
            long after = System.currentTimeMillis();
            System.out.println(method.getName() + " executed in " + (after - before) + " mSec");
            return returnObj;
        }
        return method.invoke(object, args);
    }


    public static Object newInstance(Object object) {
        Objects.requireNonNull(object);
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new CounterProxy(object)
        );
    }
}
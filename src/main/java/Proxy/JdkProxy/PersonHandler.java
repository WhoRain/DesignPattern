package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by WhoRain on 2017/4/16.
 */
public class PersonHandler implements InvocationHandler {
    private Object target;
    public PersonHandler(Object target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object obj =  method.invoke(target,args);
        System.out.println("after");
        return obj;
    }
}

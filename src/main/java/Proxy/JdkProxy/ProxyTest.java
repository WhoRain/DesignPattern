package Proxy.JdkProxy;

import java.lang.reflect.Proxy;

/**
 * Created by WhoRain on 2017/4/16.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Person p = new PersonImpl();
        PersonHandler handle =new PersonHandler(p);
        Person proxy = (Person) Proxy.newProxyInstance(p.getClass().getClassLoader(),p.getClass().getInterfaces(),handle);
        proxy.speak();
    }

}

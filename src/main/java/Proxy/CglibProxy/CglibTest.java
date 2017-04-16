package Proxy.CglibProxy;

/**
 * Created by WhoRain on 2017/4/16.
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Student studentproxy = (Student) proxy.getProxy(Student.class);
        studentproxy.speak();

    }


}

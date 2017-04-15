package Proxy.JdkProxy;

/**
 * Created by WhoRain on 2017/4/16.
 */
public class PersonImpl implements Person {
    public String json ="{\"firstName\": \"John\",\"sex\":\"man\"}";
    public String regex="[1-9]";
    public void speak() {
        System.out.println("speak......");

    }
}

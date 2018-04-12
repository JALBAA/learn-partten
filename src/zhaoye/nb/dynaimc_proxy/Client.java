package zhaoye.nb.dynaimc_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main (String[] args) throws Throwable {
        SomeObject object = new SomeObject();
        InvocationHandler handler = new GamePlayIH(object);
        ClassLoader cl = object.getClass().getClassLoader();

        ISomeObject proxy = (ISomeObject) Proxy.newProxyInstance(cl, new Class[]{ISomeObject.class}, handler);
        proxy.test();

    }
}

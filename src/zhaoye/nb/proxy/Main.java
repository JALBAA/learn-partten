package zhaoye.nb.proxy;

import java.lang.reflect.InvocationHandler;

public class Main {
    public static void main(String[] args) {
        Subject sb = new RealSubject();
        InvocationHandler handler = new IH(sb);
        Subject proxy = DynamicProxy.newProxyInstance(sb.getClass().getClassLoader(), sb.getClass().getInterfaces(), handler);
        proxy.request();
    }
}

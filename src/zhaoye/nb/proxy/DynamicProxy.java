package zhaoye.nb.proxy;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaceds, InvocationHandler handler) {
        IAdvice advice = new BeforeAdvice();
        advice.excute();
        return (T) Proxy.newProxyInstance(loader, interfaceds, handler);
    }
}

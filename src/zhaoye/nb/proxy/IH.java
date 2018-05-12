package zhaoye.nb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class IH implements InvocationHandler {
    private Object target = null;
    public  IH (Object obj) {
        this.target = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws  Throwable{
        method.invoke(this.target, args);
        return proxy;
    }
}
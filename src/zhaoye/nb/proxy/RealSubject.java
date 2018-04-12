package zhaoye.nb.proxy;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("eee");
    }
}

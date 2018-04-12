package zhaoye.nb.proxy;

public class BeforeAdvice implements IAdvice {
    @Override
    public void excute() {
        System.out.println("pre-excute");
    }
}

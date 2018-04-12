package zhaoye.nb.chain;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler (Handler next) {
        this.nextHandler = next;
    }

    public abstract void HandlerRequest();
}

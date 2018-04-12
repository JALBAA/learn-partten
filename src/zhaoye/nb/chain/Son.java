package zhaoye.nb.chain;

public class Son extends Handler {
    public Son (Handler h) {
        super(h);
    }
    @Override
    public void HandlerRequest() {
        System.out.println("ask son   ");
        if (this.nextHandler != null) {
            this.nextHandler.HandlerRequest();
        }
    }
}

package zhaoye.nb.chain;

public class Husband extends Handler {
    public Husband (Handler h) {
        super(h);
    }
    @Override
    public void HandlerRequest() {
        System.out.println("ask hunsband  ");
        if (this.nextHandler != null) {
            this.nextHandler.HandlerRequest();
        }
    }
}

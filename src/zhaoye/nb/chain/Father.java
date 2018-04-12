package zhaoye.nb.chain;

public class Father extends Handler {

    public Father (Handler h) {
        super(h);
    }
    @Override
    public void HandlerRequest() {
        System.out.println("ask father   ");
        if (this.nextHandler != null) {
            this.nextHandler.HandlerRequest();
        }
    }
}

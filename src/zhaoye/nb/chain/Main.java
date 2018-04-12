package zhaoye.nb.chain;

public class Main {
    public static void main (String[] args) {
        Handler hus = new Husband(null);
        Handler son = new Son(hus);
        Handler father = new Father(son);

        father.HandlerRequest();
    }
}

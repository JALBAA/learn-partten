package zhaoye.nb.decorator;

public class Main {
    public static void main (String[] args) {
        Component btn = new Button();
        btn.operation();
        btn = new BigButton(btn);

        btn.operation();
    }
}

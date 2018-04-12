package zhaoye.nb.mediator;

public class Main {
    public static void main (String[] args) {
        Mediator mediator = new RealMediator();

        Friend friend1 = new Friend(mediator);
        Friend friend2 = new Friend(mediator);
        mediator.setF1(friend1);
        mediator.setF2(friend2);

        friend1.tellHim("f2", "fuckyou");
    }
}

package zhaoye.nb.factory;

public class Main {
    public static void main (String[] args) {
        HumanFactory factory = new HumanFactory();
        Human w = factory.createHuman(WhiteHuman.class, "hello");
        Human b = factory.createHuman(BlackHuman.class, "guwaguwa");
        w.getColor();
        b.getColor();
        w.talk();
        b.talk();
    }
}
package zhaoye.nb.factory;
import java.lang.Class;

public class HumanFactory {
    public <T extends Human> T createHuman (Class<T> c, String arg) {
        Human human = null;
        try {
//            human = c.newInstance();
//            human.words = arg;
            human = c.getConstructor(new Class[]{String.class}).newInstance(arg);
        } catch (Exception e) {
            System.out.println(e);
        }
        return (T)human;
    }
}

package zhaoye.nb.mediator;

import java.util.List;

public abstract class Mediator<T> {
    Friend f1;
    Friend f2;
    public Mediator () {
        System.out.println("eee");
    }
    public  void setF1 (Friend f1) {
        this.f1 = f1;
    }
    public void setF2 (Friend f2) {
        this.f2 = f2;
    }

    public void tell (String name, String words) {
        if(name.equals("f1")) {
            f2.say(words);
        } else {
            f1.say(words);
        }
    }
}

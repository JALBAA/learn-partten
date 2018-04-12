package zhaoye.nb.decorator;

public class BigButton extends Decorator<Component> {
    public BigButton (Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("\nthe btn is bigger");
        ((Component)this.component).operation();
    }
}

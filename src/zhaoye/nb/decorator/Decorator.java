package zhaoye.nb.decorator;

public abstract class Decorator<T> extends Component{
    protected T component;
    public Decorator (T component) {
        this.component = component;
    }

    @Override
    public abstract void operation();
}

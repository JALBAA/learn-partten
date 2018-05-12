package zhaoye.nb.template_method;

public abstract class HummerModel {
    protected String name;
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public final void run() {
        this.engineBoom();
        this.start();
        this.alarm();
        this.stop();
    };
}

package zhaoye.nb.template_method;

public class HummberH1Model extends HummerModel {
    public HummberH1Model (String name) {
        this.name = name;
    }
    protected void start () {
        System.out.println(this.name + "start");
    }
    protected void stop () {
        System.out.println(this.name + "stop");
    }
    protected void alarm () {
        System.out.println(this.name + "alarm");
    }
    protected void engineBoom () {
        System.out.println(this.name + "engineBoom");
    }
}

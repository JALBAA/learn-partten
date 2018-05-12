package zhaoye.nb.factory;

public abstract class Human {
    protected String color;
    public  String words;
    public Human (String words) {
        this.words = words;
    }
    public void getColor () {
        System.out.println(this.color);
    };
    public void talk() {
        System.out.println(this.words);
    };
}
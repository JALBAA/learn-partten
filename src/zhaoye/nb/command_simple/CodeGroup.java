package zhaoye.nb.command_simple;

public class CodeGroup implements Group {
    @Override
    public void find() {
        System.out.println("code group find");
    }
    @Override
    public void add() {
        System.out.println("code group add");

    }
    @Override
    public void delete() {
        System.out.println("code group delete");

    }
    @Override
    public void change() {
        System.out.println("code group change");

    }
    @Override
    public void plan() {
        System.out.println("code group plan");

    }
}

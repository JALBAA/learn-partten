package zhaoye.nb.command_simple;

public class PageGroup implements Group {
    @Override
    public void find() {
        System.out.println("page group find");
    }
    @Override
    public void add() {
        System.out.println("page group add");

    }
    @Override
    public void delete() {
        System.out.println("page group delete");

    }
    @Override
    public void change() {
        System.out.println("page group change");

    }
    @Override
    public void plan() {
        System.out.println("page group plan");

    }
}

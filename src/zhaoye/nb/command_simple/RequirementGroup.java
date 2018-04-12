package zhaoye.nb.command_simple;

public class RequirementGroup implements Group {
    @Override
    public void find() {
        System.out.println("Requirement group find");
    }
    @Override
    public void add() {
        System.out.println("Requirement group add");

    }
    @Override
    public void delete() {
        System.out.println("Requirement group delete");

    }
    @Override
    public void change() {
        System.out.println("Requirement group change");

    }
    @Override
    public void plan() {
        System.out.println("Requirement group plan");

    }
}

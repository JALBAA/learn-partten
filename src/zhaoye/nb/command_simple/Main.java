package zhaoye.nb.command_simple;

public class Main {
    public static void main (String[] args) {
        Invoker xiaoSan = new Invoker();
        Command command = new AddRequirementCommand();

        xiaoSan.action(command);

        Command command1 = new DeletePageCommand();

        xiaoSan.action(command1);
    }
}

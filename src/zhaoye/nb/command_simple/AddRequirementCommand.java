package zhaoye.nb.command_simple;

public class AddRequirementCommand extends Command {
    @Override
    public void excute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}

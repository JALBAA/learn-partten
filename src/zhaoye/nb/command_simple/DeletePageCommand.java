package zhaoye.nb.command_simple;

public class DeletePageCommand extends Command{
    @Override
    public void excute() {
        super.pg.find();
        super.rg.delete();
        super.rg.plan();
    }
}

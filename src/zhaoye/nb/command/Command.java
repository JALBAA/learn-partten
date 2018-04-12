package zhaoye.nb.command;

public abstract class Command {
    protected final  Reciver reciver;

    public  Command (Reciver _reciver) {
        this.reciver = _reciver;
    }
    public abstract void execute();
}


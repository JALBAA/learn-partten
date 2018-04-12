package zhaoye.nb.mediator;

public abstract class AFriend {
    Mediator mediator;
    public AFriend (Mediator mediator) {
        this.mediator = mediator;
    }
    public void say (String words) {
        System.out.println("say" + words);
    }
    public void tellHim(String whoami, String str) {
        this.mediator.tell(whoami, str);
    }
}
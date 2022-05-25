package src.other;

public class OverrideSub extends OverrideBase{
    public void live(){
        System.out.println("住在新家");
    }

    public void doSuper(){
        super.live();
    }

    public void doThis(){
        this.live();
    }
}

package src.other;

public class OverrideMain {
    public static void main(String[] args) {
        OverrideSub sub = new OverrideSub();
        sub.live();
        sub.doSuper();
        sub.doThis();

    }
}

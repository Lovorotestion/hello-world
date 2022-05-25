package src.other;

public class HiddenName {
    public static void main(String[] args) {
        HiddenSub sub = new HiddenSub();
        System.out.println(sub.name);
        sub.showSuper();
        sub.showThis();



    }
}

package src.other;

public class HiddenSub extends HiddenBase{
    public String name = "子类的成员变量";

    public void showSuper(){
        System.out.println("super:"+super.name);
    }

    public void showThis(){
        System.out.println("this:"+this.name);
    }
}

package src.interfaceDemo;

public class MultiRuleImpl implements MultiRuleAbstractOne,MultRuleAbstractTwo{
    @Override
    public void two() {
        System.out.println("吃");

    }

    @Override
    public void sameName() {
        System.out.println("喝");

    }

    @Override
    public void one() {
        System.out.println("玩");

    }
}

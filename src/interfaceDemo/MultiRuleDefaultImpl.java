package src.interfaceDemo;

public class MultiRuleDefaultImpl implements MultiRuleDefaultOne,MultiRuleDefaultTwo{

    @Override
    public void one() {
        MultiRuleDefaultOne.super.one();
    }

    @Override
    public void two() {
        MultiRuleDefaultTwo.super.two();
    }

    @Override
    public void sameName() {
//        MultiRuleDefaultOne.super.sameName();
        System.out.println("如果多接口，必须重写");
    }
}

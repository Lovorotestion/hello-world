package src.interfaceDemo;

public interface MultiExtendImpl extends MultiExtentOne,MultiExtentTwo{

    @Override
    default void sameName() {
        MultiExtentOne.super.sameName();
        System.out.println("哈哈哈");
    }
}

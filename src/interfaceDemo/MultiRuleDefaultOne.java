package src.interfaceDemo;

public interface MultiRuleDefaultOne {
    public default void one(){
        System.out.println("默认一");

    }

    public default void sameName(){
        System.out.println("默认同名");

    }
}

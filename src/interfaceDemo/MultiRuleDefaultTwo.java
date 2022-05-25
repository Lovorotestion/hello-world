package src.interfaceDemo;

public interface MultiRuleDefaultTwo {
    public default void two(){
        System.out.println("two");

    }
    public default void sameName(){
        System.out.println("同名");

    }

}

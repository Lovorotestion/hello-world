package src.interfaceDemo;

public interface PriSchool {
    public default void study(){
        System.out.println("上课");
    }
}

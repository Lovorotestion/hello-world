package src.method;

public class MethodCall {
    public static int sum(int a, int b){
        int result = a+b;
        return result;
    }

    public static void main(String[] args) {
        sum(5,10);
        int total = sum(15,20);
        System.out.println(sum(5,10));
        System.out.println(total);
    }

}

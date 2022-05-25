package src.method;

public class MethodReload {

    public static void main(String[] args) {
        int m =sum(5,19);
        int n =sum(6,9,60);
        System.out.println(m);
        System.out.println(n);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a,int b, int c){
        return a+b+c;
    }

}

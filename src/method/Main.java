package src.method;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"张三","李四","王二"};
        System.out.println(arr);
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(",");
            }else {
                System.out.print("]");
            }

        }
    }


}

public class SilentTrans {

    public static void main(String[] args) {
        //char类型
        char c1 ='A';
        int myInt =c1;
        System.out.println(myInt);

        //char参与运算，自动转成int类型
        char c2 = 'a';
        int myInt2 = c2+2;
        System.out.println(myInt2);

        //short参与运算，自动转成int类型
        short short1 = 6;
        System.out.println(short1+2);

    }
}

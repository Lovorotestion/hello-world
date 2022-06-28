package src.hidden.method;

public class TestCalculation extends Calculation{
    int x = 100;
    void printb(){
        super.x=super.x+10;
        System.out.println(super.x);
    }

    void printc(){
        System.out.println(x);
    }

//    public static void main(String[] args) {
//        TestCalculation testCalculation =new TestCalculation();
//        testCalculation.printa();
//        testCalculation.printb();
//        testCalculation.printc();
//    }
}

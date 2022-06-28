package src.hidden.method;

public class Demo {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.satx(4);
        calculation.printa();

        TestCalculation testCalculation = new TestCalculation();
        testCalculation.printb();
        testCalculation.printa();

        testCalculation.satx(6);
        testCalculation.printb();
        testCalculation.printa();

        calculation.printa();

    }


}

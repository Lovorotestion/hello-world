package src.structure.method1;

public class Sandwich extends PortableLunch{
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();

    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }


}

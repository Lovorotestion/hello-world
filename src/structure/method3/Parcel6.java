package src.structure.method3;

public class Parcel6 {
    public Contents cont(){
        return new Contents() {
            private int i =11;
            @Override
            public int value() {
                return i;

            }
        };
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
        System.out.println(c);
    }
}

package src.structure.method3;

public class Parcle2Test {
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tanzania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.cont();
        Parcel2.Destination d = q.to("BOrneo");
    }
}

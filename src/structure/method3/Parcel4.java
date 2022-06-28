package src.structure.method3;

public class Parcel4 {
    public Destination dest(String s){
         class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label=whereTo;
            }

             @Override
             public String readLable() {
                 return label;
             }
         }
        return new PDestination(s);

    }


}

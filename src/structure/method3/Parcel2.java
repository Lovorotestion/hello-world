package src.structure.method3;

public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label=whereTo;
        }

        String readLable(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents cont(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = cont();
        Destination d = to(dest);
        System.out.println(d.readLable());
    }
}

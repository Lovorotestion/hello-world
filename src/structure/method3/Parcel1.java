package src.structure.method3;

public class Parcel1 {
    class Contents {
        //内部类--包裹
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String lable;
        Destination(String whereTo) {
            lable = whereTo;
        }
        String readLable() {
            return lable;
        }

    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLable());
    }
}

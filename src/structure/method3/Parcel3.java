package src.structure.method3;

public class Parcel3 {
    private class PContents extends Contents{
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String lable;
        private PDestination(String whereTo){
            lable=whereTo;
        }
        public String readLable(){
            return lable;
        }
        public Destination dest(String s){
            return new PDestination(s);
        }
        public Contents cont(){
            return new PContents();
        }
        }

}

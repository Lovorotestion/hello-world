public class ArrayReverse {
    public static void main(String[] args) {

        int[] oldarr = {10,20,30,40,50};
        int[] newArr = new int[oldarr.length];

        for (int i=0; i< newArr.length;i++){

            newArr[i]=oldarr[oldarr.length-1-i];
            System.out.println(newArr[i]);

        }
    }
}

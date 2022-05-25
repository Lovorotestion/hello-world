package src.multi_01;

public class FatherSon extends MethodFather{
    public void sonEat(){

        System.out.println("son在吃饭");

    }

    @Override
    public void run(){
        System.out.println("son在跑步");
    }



}

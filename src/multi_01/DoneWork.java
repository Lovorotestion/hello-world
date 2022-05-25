package src.multi_01;

public class DoneWork implements Person{


    @Override
    public void run() {
        System.out.println("Worker在跑步");
    }

    public void work(){
        System.out.println("Work在工作");

    }
}

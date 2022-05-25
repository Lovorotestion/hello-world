package src.multi_01;

public class DownMain {
    public static void main(String[] args) {
        Person person = new DoneWork();
        person.run();

//        System.out.println(person instanceof DoneWork);

        if(person instanceof DoneWork){
            DoneWork doneWork = (DoneWork) person;
            doneWork.work();
            doneWork.run();

        }



    }
}

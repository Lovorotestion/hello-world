package src.structure_method;

public class JavaTeacher extends Teacher{
    public JavaTeacher(String myName,String mySchool){
        super(myName,mySchool);

    }

    public void giveLesson(){
        System.out.println("启动Idear");
        super.givelesson();
    }


}

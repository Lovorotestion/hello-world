package src.structure_method;

public class HQ1 {

    public void judge(Teacher t){
        t.introduction();
        t.givelesson();
    }

    public static void main(String[] args) {
        HQ1 hq1 = new HQ1();
        hq1.judge(new JavaTeacher("王军","北京大学"));
        hq1.judge(new JavaTeacher("张三","北京大学"));

    }
}

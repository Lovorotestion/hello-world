package src.package_method;

public class Teacher {
    private String name; //教师姓名
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<22){
            System.out.println("不符合"+age+"岁年龄限制");
            this.age=22;
        }else {
            this.age = age;
        }

    }

    public String introducton(){
        return "大家好！我是" + name + "，我今年" +age+"岁";
    }
}

package OOP_Object_Oriented_Programming.demo03;

/*
* 对于基本类型当中的布尔型，Getter方法必须写成isXxx的形式，setXxx规则不变
* */

public class Student {

    private String name;
    private int age;
    private boolean male;

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
    public boolean isMale() {
        return male;
    }
}

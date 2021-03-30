package OOP_Object_Oriented_Programming.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println("=============");

        Student stu1 = new Student("ZLY", 998);
        System.out.println("姓名：" + stu1.getName() + " 年龄：" + stu1.getAge());
        //改变对象当中的数据内容，仍然需要用到setXxx方法
        stu1.setAge(999);
        System.out.println("姓名：" + stu1.getName() + " 年龄：" + stu1.getAge());
    }

}

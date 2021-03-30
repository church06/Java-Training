package OOP_Object_Oriented_Programming.demo05;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("DLRB");
        stu1.setAge(125);
        System.out.println("姓名：" +stu1.getName() + " 年龄：" + stu1.getAge());
        System.out.println("================");

        Student stu2 = new Student("GLNZ", 70);
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge());
        stu2.setAge(71);
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge());

    }

}

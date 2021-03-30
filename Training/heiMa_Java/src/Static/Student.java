package Static;

public class Student {

    private String name; // 姓名
    private int age; // 年龄
    static  String room; // 所在教室
    private int id; // 学号
    private static int idCounter = 0; // 学号计数器，每当new新对象时，计数器++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public Student() {
        this.id = ++idCounter;
    }
}

package Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * 直接打印对象的地址值没有意义，需要重写Object类中的toString方法
     * 打印对象属性(name, age)
     * */

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
     * Object类的euqals方法，默认比较两个地址值，没有意义
     * 重写equals方法，比较两个对象的属性 (name, age)
     *
     * 问题：
     * 隐含多态，因此无法使用子类特有内容 (属性和方法)
     * 解决：
     * 使用向下转型(强转)，将Object类型转换为Person
     * */

/*    @Override
    public boolean equals(Object obj) {
        // 增加一个判断，传递的参数obj如果是this本身，直接返回true，空则返回false。提高程序效率
        if (obj == this) {
            return true;
        } else if (obj == null) {
            return false;
        }

        // 判断防止类型转换法发生ClassCastException异常
        if (obj instanceof Person) {
            // 比较两个对象的属性，一个对象是this(p1)，一个对象是p(obj -> p2)
            Person p = (Person) obj;
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // ======================================


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
}

package Abstract.demo04;

public class User {

    private String name;
    private int money; // 余额

    // 展示当前用户有多少钱
    public void show() {
        System.out.println("我叫：" + name + "，剩余：" + money + " 块");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

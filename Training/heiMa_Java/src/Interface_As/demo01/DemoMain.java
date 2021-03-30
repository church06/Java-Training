package Interface_As.demo01;

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起名字
        hero.setName("G41");
        hero.setAge(8);

        // 创建一个武器对象
        Weapon weapon = new Weapon("Automatic Rifle HK-G41");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack(); // 年龄为8的G41用Automatic Rifle HK-G41进行攻击
    }
}

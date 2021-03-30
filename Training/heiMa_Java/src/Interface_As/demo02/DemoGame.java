package Interface_As.demo02;

public class DemoGame {

    public static void main(String[] args) {
        Hero HK416 = new Hero();
        HK416.setName("HK416");

        // 设置技能
        HK416.setSkill(new SkillImpl());
        HK416.attack();

        System.out.println("======================");

        // 使用匿名内部类设置技能
        Skill skill = new Skill() {
            @Override
            public void use() {

            }
        };
        HK416.setSkill(skill);
        HK416.attack();

        System.out.println("=======================");

        // 进一步简化。使用匿名内部类和匿名对象设置技能
        HK416.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("乌拉~哒哒哒哒哒哒哒哒");
            }
        });

        HK416.attack();
    }
}

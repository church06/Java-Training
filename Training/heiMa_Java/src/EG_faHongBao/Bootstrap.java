package EG_faHongBao;

/*
 * 场景说明：
 * 1. 红包发出去后，所有人都有红包，抢完后剩余的留给群主
 * 2. 多数代码现成，仅填空
 *
 * 要做的事情：
 * 1. 设置程序标题：通过构造方法的字符参数
 * 2. 设置群主名称
 * 3. 设置分发策略，平均还是随机
 *
 * 发红包策略：
 * 1. 普通红包(平均)：totalMoney / totalCount，余数放在最后一个一个红包中
 * 2. 手气红包(随机)：最少1分，最多不超过平均数的2倍。且月越发越少
 * */

public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("红包");

        // 设置群主名称
        red.setOwnerName("si_cong");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // 随机红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}

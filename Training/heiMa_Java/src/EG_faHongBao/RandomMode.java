package EG_faHongBao;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        // 随机分配，可能多，可能少
        // 最少1分，最多不超过剩下金额平均数的2倍
        // 第一次发红包，随机范围是0.01元~6.66元
        // 第一次发完后至少是3.34元
        // 此时还需要再发2个红包，范围是0.01~3.34元 (取不到右侧，剩余0.01)

        // 范围公式：1+ random.nextInt(leftMoney / leftCount * 2)
        Random r = new Random(); // 随机数生成器
        // totalMoney是总金额，totalCount是总份数，不变
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // 随机法n-1个，最后一个不需要随机
        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);
            leftMoney -= money; // 钱越发越少
            leftCount--; // 人数=每发一个人少一个
        }

        // 最后一个红包不需要随机，直接放进去
        list.add(leftMoney);

        return list;
    }
}

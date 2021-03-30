package Interface_As.demo02;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {

    public static void main(String[] args) {
        // 多态写法，左侧接口名称，右侧实现类名称
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);

        // Normal for
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        System.out.println("====================");

        // Enhance for
        for (String string : result) {
            System.out.println(string);
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        return list;
    }
}

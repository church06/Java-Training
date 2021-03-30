package Arrays;

/*
* 题目：
* 请使用Arrays相关的API，将一个随机字符串中的虽有字符升序排列，并倒序打印
* */

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "asdfiuhasdlifuhasdlgadaosdihafgqpqkcvbiszzjkeiutlybnaalxckvbkz";

        // 升序排列：sort
        // 是个数组：toCharArray()
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i]);
            }
        }
    }
}

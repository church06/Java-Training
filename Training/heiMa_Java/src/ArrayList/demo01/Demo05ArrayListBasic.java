package ArrayList.demo01;

import java.util.ArrayList;

/*
* 若想向Arrayist中存储基本类型数据，需要使用包装类
* 基本类型   包装类(引用类型，包装类都位于java.lang)
* byte      Byte
* short     Short
* int       Integer     [特殊]
* long      Long
* float     Float
* double    Double
* char      Character   [特殊]
* boolean   Boolean
*
* jdk 1.5+ 后，支持自动装箱、拆箱
* 自动装箱：基本类型 --> 包装类型
* 自动拆箱：包装类型 --> 基本类型
* */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(173);
        listC.add(102);
        listC.add(198);
        System.out.println(listC);
        int num = listC.get(1);
        System.out.println("num 1: " + num);
    }
}

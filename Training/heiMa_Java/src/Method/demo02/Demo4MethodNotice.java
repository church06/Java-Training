package Method.demo02;

public class Demo4MethodNotice {
    /*
    * 1. 方法应定义在类当中而不能在方法中，不能嵌套
    * 2. 方法定义前后顺序无所谓
    * 3. 方法定义后不会执行，执行需要调用(打印调用，单独调用，赋值调用)
    * 4. 方法有返回值则必须return
    * 5. void无返回值不能return返回值，只能return自己
    * 6. 两个return不能连写
    * 7. void方法可省略return
    * 8. 多个return必须保证只会有一个被执行
    * */

    public static void main(String[] args) {
        hhhh();
        int sum = method2();
        System.out.println(sum);
        System.out.println(Measure(999, 17));
    }

    public static void hhhh() {
        System.out.println("嘤嘤嘤嘤");
        return; // 没有返回值，只结束方法执行
        //return; 可以省略不写
    }

    public static int method2() {
        return 10; //返回int 10
    }

    // 比大小
    public static int Measure(int a, int b) {
        if(a > b) {
            return a;
        }
        else{
            return b;
        }
    }
}

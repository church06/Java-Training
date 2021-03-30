package Final.demo01;

/*
 * 当final关键字修饰一个方法时，这个方法是最终方法，不能被覆盖重写
 * 格式：
 * 修饰符 final 返回额理性 方法名称(参数列表) {
 *     // ...
 * }
 *
 * 注意事项：
 * 对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
 * */

public class Fu {

    public final void method() {
        System.out.println("父类方法执行");
    }
}

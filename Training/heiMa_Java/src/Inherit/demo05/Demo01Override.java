package Inherit.demo05;

/*
* 方法覆写的注意事项：
* 1. 必须保证父子类之间方法的的名称相同，参数列表也相同
* @Override：写在方法前，用来检测是不是有效正确覆写
* 这个注解(implement)，只要满足要求依旧是覆写
* 2. 子类方法的返回值必须 <= 父类方法的返回值范围
* 前提：java.lang.Object类的所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类
*
* 3. 子类方法的权限必须 >= 父类的权限修饰符
* Tip：public > protected > (default) > private
* 备注：(default)不是关键字，而是什么都不写，留空
* */

public class Demo01Override {
}

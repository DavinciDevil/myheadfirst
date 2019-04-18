/**
 * 版权声明 springcity 版权所有,违者必究
 * <p>
 * <br> Copyright：Copyright (c)  2018
 * <br> Company: springcity
 * <br> Author: lincc(l85520949@163.com)
 * <br> Date：2018-11-12
 * <br> Version： 1.0
 */
package decorate;

/**
 * <br>
 * <b>功能描述:</b>
 * <p/>
 * <pre>
 *  装饰者模式：
 *      1.拥有一个共同的超类，以达到类型匹配的目的。
 *      2.子类中传入超类类型参数，通过超类的共同方法，对于关注的数据层层包裹，加工。
 *      3.最后得到关注的数据。
 *      比如javaio的stream流就是典型的装饰者模式
 * </pre>
 *
 * @author lincc(l85520949@163.com)
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Coffe();
        beverage = new Sugar(beverage);
        beverage = new Sugar(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Espresso();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
    }
}

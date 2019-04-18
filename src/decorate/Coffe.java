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
 *  //TODO
 * </pre>
 *
 * @author lincc(l85520949@163.com)
 * @since 1.0
 */
public class Coffe extends Beverage {

    public Coffe() {
        description = "Coffe";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

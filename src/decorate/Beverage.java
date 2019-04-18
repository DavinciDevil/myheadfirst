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
public abstract class Beverage {

    //注意：这里是protected访问权限，protected与默认访问权限（String前没有修饰符）
    //都具有包访问权限，即同一个包下，都可以访问该属性。
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

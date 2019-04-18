/**
 * 版权声明 springcity 版权所有,违者必究
 * <p>
 * <br> Copyright：Copyright (c)  2018
 * <br> Company: springcity
 * <br> Author: lincc(l85520949@163.com)
 * <br> Date：2018-10-08
 * <br> Version： 1.0
 */
package observer;

/**
 * <br>
 * <b>功能描述:</b>
 * <p/>
 * <pre>
 *  观察者模式：
 *      内容发布者发布内容，并通知订阅了该内容的订阅者来取数据。
 *      订阅者：订阅对应的内容发布者，把自己添加到内容发布者的订阅者队列中以便及时获取到数据。一旦内容发布者提醒内容更新后，就获取数据。
 * </pre>
 *
 * @author lincc(l85520949@163.com)
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        for (int i = 0; i < 3; i++) {
            CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(data);
            ForecastDisplay forecastDisplay = new ForecastDisplay(data);
        }

        data.setMeasurements(10f,20f,1000f);
    }
}

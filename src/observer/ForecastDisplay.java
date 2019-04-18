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

import java.util.Observable;
import java.util.Observer;

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
public class ForecastDisplay implements Observer,DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  WeatherData){
            WeatherData data = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = data.getPressure();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay{" +
                "observable=" + observable +
                ", currentPressure=" + currentPressure +
                ", lastPressure=" + lastPressure +
                '}');
    }
}

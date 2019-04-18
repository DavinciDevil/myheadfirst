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
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData data = (WeatherData) observable;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("CurrentConditionDisplay{" +
                "observable=" + observable +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}

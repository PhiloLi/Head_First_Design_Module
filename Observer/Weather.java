package Observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 具体的主题
 * 
 * */
public class Weather implements Subject {
	float temp;
	float humidity;
	float pressure;
	List<Observer> list = new ArrayList();
    public Weather(float temp, float humidity, float pressure){
    	this.temp = temp;
    	this.humidity = humidity;
    	this.pressure = pressure;
    }
	@Override
	public void registerObserver(Observer o) {
		// TODO 自动生成的方法存根
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO 自动生成的方法存根
		list.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.update(temp, humidity, pressure);
		}
		// TODO 自动生成的方法存根
	}
}

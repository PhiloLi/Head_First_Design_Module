package Observer;

public class CurrentDisplay implements Observer {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weather;
	public CurrentDisplay(Subject w){
		weather = w;
		weather.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO 自动生成的方法存根
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		System.out.println(temp +" "+humidity+" "+pressure);
		
	}
}

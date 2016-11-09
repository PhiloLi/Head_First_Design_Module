package Observer;

public class Test {
	public static void main(String[] args) {
		Subject sub = new Weather(12.5f,12.6f,12.7f);
		Observer ob1 = new CurrentDisplay(sub);
		Observer ob2 = new CurrentDisplay(sub);
		sub.notifyObserver();
		sub.removeObserver(ob2);
		sub.notifyObserver();
	}
	
	
}

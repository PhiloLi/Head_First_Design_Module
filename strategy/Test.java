package strategy;

public class Test {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Duck duck = new MallardDuck();
		duck.fly();
		duck.setFly(new FlyWithWings());
		duck.fly();
	}
}

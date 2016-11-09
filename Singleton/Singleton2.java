package Singleton;
/**
 * 急切的方式，在程序开始时，声明对象
 * */
public class Singleton2 {
	private Singleton2(){}
	private Singleton2 instance = new Singleton2();
	public Singleton2 getInstace(){
		return instance;
	}
}

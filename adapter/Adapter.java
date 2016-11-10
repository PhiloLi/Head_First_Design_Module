package adapter;
/**
 * 一个具体的适配器
 * */
public class Adapter implements Target {
	
	private Adaptee adaptee = new Adaptee();
	public void request() {
		adaptee.specificRequcst();
		// TODO 自动生成的方法存根
	}
}

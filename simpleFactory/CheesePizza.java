package simpleFactory;
/**
 * 具体的工厂产品
 * */
public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO 自动生成的方法存根
		super.prepare();
		System.out.println("CheesePizza prepare");
	}

	@Override
	public void bake() {
		// TODO 自动生成的方法存根
		super.bake();
		System.out.println("CheesePizza bake");
	}

	@Override
	public void cut() {
		// TODO 自动生成的方法存根
		super.cut();
		System.out.println("CheesePizza cut");
	}

	@Override
	public void box() {
		// TODO 自动生成的方法存根
		super.box();
		System.out.println("CheesePizza box");
	}
	
}

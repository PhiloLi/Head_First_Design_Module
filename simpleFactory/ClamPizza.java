package simpleFactory;

public class ClamPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO 自动生成的方法存根
		super.prepare();
		System.out.println("ClamPizza prepare");
	}

	@Override
	public void bake() {
		// TODO 自动生成的方法存根
		super.bake();
		System.out.println("ClamPizza bake");
	}

	@Override
	public void cut() {
		// TODO 自动生成的方法存根
		super.cut();
		System.out.println("ClamPizza cut");
	}

	@Override
	public void box() {
		// TODO 自动生成的方法存根
		super.box();
		System.out.println("ClamPizza box");
	}
	
}

package factory_pattern;

public class NYStyleCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO 自动生成的方法存根
		super.prepare();
		System.out.println("NYstyleCheesePizza prepare");
	}

	@Override
	public void bake() {
		// TODO 自动生成的方法存根
		super.bake();
		System.out.println("NYstyleCheesePizza bake");
	}

	@Override
	public void cut() {
		// TODO 自动生成的方法存根
		super.cut();
		System.out.println("NYstyleCheesePizza cut");
	}

	@Override
	public void box() {
		// TODO 自动生成的方法存根
		super.box();
		System.out.println("NYstyleCheesePizza box");
	}
	
}

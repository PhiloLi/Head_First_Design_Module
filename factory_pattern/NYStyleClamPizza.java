package factory_pattern;

public class NYStyleClamPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO 自动生成的方法存根
		super.prepare();
		System.out.println("NYStyleClamPizza prepare");
	}

	@Override
	public void bake() {
		// TODO 自动生成的方法存根
		super.bake();
		System.out.println("NYStyleClamPizza bake");
	}

	@Override
	public void cut() {
		// TODO 自动生成的方法存根
		super.cut();
		System.out.println("NYStyleClamPizza cut");
	}

	@Override
	public void box() {
		// TODO 自动生成的方法存根
		super.box();
		System.out.println("NYStyleClamPizza box");
	}
	
}

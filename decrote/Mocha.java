package decrote;
/**
 * 装饰者
 * 
 * */
public class Mocha extends Decorator {

	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription()+ " Mocha";
	}

	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return beverage.cost() + 0.20;
	}
}

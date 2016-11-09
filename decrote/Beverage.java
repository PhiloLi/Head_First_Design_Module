package decrote;
/**
 * 最高级的抽象，所有的组件和装饰都继承自Beverage
 * */
public abstract class Beverage {
	String description = "unknown";
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}

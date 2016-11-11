package factory_pattern;

public class NYPizzaStore extends PizzaStore {
	@Override
	Pizza createPizza(String type) {
		// TODO 自动生成的方法存根
		Pizza pizza = null;
		switch(type){
		case "cheese":
			pizza = new NYStyleCheesePizza();
			break;
		case "clam":
			pizza = new NYStyleClamPizza();
		default:
				break;
		}
		return pizza;
	}
}

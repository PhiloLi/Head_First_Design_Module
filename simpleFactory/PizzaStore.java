package simpleFactory;

public class PizzaStore {
	SimplePizzaFactory factory = null;
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	public void orderPizza(String type){
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
}

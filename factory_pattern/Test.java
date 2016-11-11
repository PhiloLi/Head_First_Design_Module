package factory_pattern;

public class Test {
	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		store.orderPizza("cheese");
		store.orderPizza("clam");
	
		
	}
}

package simpleFactory;

public class Test {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		store.orderPizza("cheese");
		store.orderPizza("clam");
		
	}
}

package strategy;

public class Duck {
	FlyBehavior fly;
	public Duck(){
		fly = new FlyNoWays();
	}
	public void fly(){
		fly.fly();
	}
	public void setFly(FlyBehavior fly){
		this.fly = fly;
	}
}

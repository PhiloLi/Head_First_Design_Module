package Singleton;

public class Singleton {
	private volatile static Singleton instance;
	private Singleton(){}
	//在多线程下会失效
//	public Singleton getInstance(){
//		if(instance == null)
//			instance = new Singleton();
//		return instance;
//	}
	public Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}
	
}

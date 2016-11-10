package adapter;

public class Test {
	public static void main(String[] args) {
		Target tar = new Adapter();
		tar.request();
	}
}

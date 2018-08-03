
public class Main {
	public static void main(String[] args) {
		Subject real = new RealSubject();
		Subject proxy1 = new Proxy(real);
		Subject proxy2 = new Proxy(real);
		
		//프록시 자신이 처리할 수 있는 기능.
		proxy1.action1();
		proxy2.action1();
		//프록시 자신이 처리할 수 없는 기능.
		proxy1.action2();
		proxy1.action2();

		
	}
}

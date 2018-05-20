package 디자인패턴.Strategy;

public class AObj {
	
	private Ainterface inter;

	public AObj() {
		inter = new AinterfaceImpl();
	}
	public void funcA() {
		//다른 객체를 사용하여 구현하는 것. delegate:위임한다

		inter.funcA();
		inter.funcA();
	}
	
}

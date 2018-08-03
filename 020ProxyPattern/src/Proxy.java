
public class Proxy implements Subject {

	Subject subject;
	public Proxy(Subject subject) {
		this.subject=subject;
	}
	@Override
	public void action1() {
		System.out.println("간단한 업무 by proxy");
	}

	@Override
	public void action2() {
		subject.action2();
	}
	
}

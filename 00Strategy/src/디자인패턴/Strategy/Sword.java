package 디자인패턴.Strategy;

public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("칼 공격");
	}

}

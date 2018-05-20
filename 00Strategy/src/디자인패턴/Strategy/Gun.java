package 디자인패턴.Strategy;

public class Gun implements Weapon {

	@Override
	public void attack() {
		System.out.println("총 공격");
	}

}

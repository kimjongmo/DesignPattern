package 디자인패턴.Strategy;

public class Character {
	private Weapon weapon=null;
	
	public void setWeapon(Weapon weapon) {
		this.weapon=weapon;
	}
	public void attack() {
		if(weapon==null)
			System.out.println("맨손 공격");
		else
			weapon.attack();
	}
}

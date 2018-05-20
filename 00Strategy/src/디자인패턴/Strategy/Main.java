package 디자인패턴.Strategy;

public class Main {
	public static void main(String[] args) {
		Character character = new Character();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Gun());
		character.attack();
	}
}

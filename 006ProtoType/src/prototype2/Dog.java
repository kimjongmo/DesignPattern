package prototype2;

public class Dog implements Cloneable{
	private String name;
	private Age age;
	
	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Dog copy() throws CloneNotSupportedException {
		Dog dog = (Dog)clone();
		if(age==null) {
			return dog;
		}else {
			dog.setAge(new Age(this.age.getYear(),this.age.getValue()));//새로운 객체를 만들어 준다.
			return dog;
		}
	}
	
}

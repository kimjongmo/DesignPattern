package prototype2;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*-----------------낮은 수준의 복사 (주소를 그대로 복사함.)---------------------*/
		Cat navi = new Cat();
		navi.setName("navi");
		
		Cat yo = navi;
		yo.setName("yo");
	
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		System.out.println(navi == yo); //true
		
		/*---------------------깊은 복사-------------------*/
		Dog mo = new Dog();
		mo.setName("mo");
		
		Dog momo = mo.copy();
		momo.setName("momo");
		
		System.out.println(mo.getName());
		System.out.println(momo.getName());
		System.out.println(mo == momo);//false
		
		
		/*같은 객체가 아니지만 복사하는 중간에 =으로 인해 메모리를 공유하게 되는 것 같다. */
		Dog mo1 = new Dog();
		mo1.setName("mo1");
		mo1.setAge(new Age(2013,3));
		
		Dog momo1 = mo1.copy();
		momo1.setName("momo1");
		momo1.getAge().setYear(2013);
		momo1.getAge().setValue(2);
		
		System.out.println(mo1.getName()+","+mo1.getAge().getYear()+","+mo1.getAge().getValue());
		System.out.println(momo1.getName()+","+momo1.getAge().getYear()+","+momo1.getAge().getValue());
		System.out.println(mo1==momo1); //false
		System.out.println(mo1.getAge()==momo1.getAge());//true 같은 객체 주소.
	}
}

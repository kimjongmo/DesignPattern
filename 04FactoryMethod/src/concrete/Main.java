package concrete;

import framework.Item;
import framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item,item1;
		
		creator = new HpCreator();
		
		item = creator.create();
		
		creator = new MpCreator();
		item1 = creator.create();
		
		item.use();
		item1.use();
	}
}

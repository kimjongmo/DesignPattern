package Adapter;

public class AdapterImpl implements Adapter{
	@Override
	public void sort() {
		Sort.quick();
	}
}

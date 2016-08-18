package chart3.methodInject.lookup;

public class Printer {

	private int counter;
	public void print(String type){
		System.out.println(type+ " printer:" + (++counter));
	}
}

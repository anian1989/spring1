package chart2;

public class HelloImpl2 implements HelloApi2 {

	private String message;
	private int index;
	@java.beans.ConstructorProperties({"message", "index"})
	public HelloImpl2(String message, int index) {
		this.message = message;
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index +":"+message);

	}

}

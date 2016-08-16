package chart3.autowire;

public class HelloApiDecorator implements HelloApi {
	private HelloApi helloApi33;

	public HelloApi getHelloApi33() {
		return helloApi33;
	}

	public void setHelloApi33(HelloApi helloApi33) {
		this.helloApi33 = helloApi33;
	}
	

	public HelloApiDecorator() {
	}
	

	public HelloApiDecorator(HelloApi helloApi33) {
		this.helloApi33 = helloApi33;
	}

	@Override
	public void sayHello() {
		System.out.println("==============装饰前==========================");
		helloApi33.sayHello();
		System.out.println("==============装饰后==========================");

	}

}

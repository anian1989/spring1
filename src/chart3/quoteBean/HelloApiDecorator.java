package chart3.quoteBean;

public class HelloApiDecorator implements HelloApi33 {
	private HelloApi33 helloApi33;

	public HelloApi33 getHelloApi33() {
		return helloApi33;
	}

	public void setHelloApi33(HelloApi33 helloApi33) {
		this.helloApi33 = helloApi33;
	}
	

	public HelloApiDecorator() {
	}
	

	public HelloApiDecorator(HelloApi33 helloApi33) {
		this.helloApi33 = helloApi33;
	}

	@Override
	public void sayHello() {
		System.out.println("==============装饰前==========================");
		helloApi33.sayHello();
		System.out.println("==============装饰后==========================");

	}

}

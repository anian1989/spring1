package chart3.dependencyCheck;

public class HelloApiDecorator implements HelloApi {
	private HelloApi helloApi;
	
	private String message;

	public HelloApi gethelloApi() {
		return helloApi;
	}

	public void sethelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}
	

	public HelloApiDecorator() {
	}
	

	public HelloApiDecorator(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	@Override
	public void sayHello() {
		System.out.println("==============装饰前==========================");
		helloApi.sayHello();
		System.out.println("==============装饰后==========================");

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

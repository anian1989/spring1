package chart1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void HelloTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:chart1/hello.xml");
		HelloApi helloApi = applicationContext.getBean("hello",HelloApi.class);
		helloApi.sayHello();		
		
		
	}

}

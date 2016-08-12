package chart2;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testContructor {
	@Test
	public void test(){
		BeanFactory beans  = new ClassPathXmlApplicationContext("classpath:chart2/hello2.xml");
		
		HelloApi2 bean = beans.getBean("byIndex", HelloApi2.class);
		bean.sayHello();
		
		HelloApi2 bean2 = beans.getBean("byType", HelloApi2.class);
		bean2.sayHello();
		
		HelloApi2 bean3 = beans.getBean("byName", HelloApi2.class);
		bean3.sayHello();
	}
	
	//静态工厂
	@Test
	public void testStaticFactory(){
		BeanFactory beans  = new ClassPathXmlApplicationContext("classpath:chart2/hello2.xml");
		
		HelloApi2 bean = beans.getBean("staticFatory", HelloApi2.class);
		bean.sayHello();
	}
	
	//实例工厂类
	@Test
	public void testInstance(){
		BeanFactory beans  = new ClassPathXmlApplicationContext("classpath:chart2/hello2.xml");
		
		HelloApi2 bean = beans.getBean("instanceBean", HelloApi2.class);
		bean.sayHello();
	}
	
	
}

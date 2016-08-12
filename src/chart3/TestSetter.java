package chart3;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {
	@Test
	public void testSetter(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/hello3.xml");
		HelloApi3 bean = beans.getBean("bean",HelloApi3.class);
		bean.sayHello();
	}
}

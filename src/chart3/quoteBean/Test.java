package chart3.quoteBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@org.junit.Test
	public void testBean(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/quoteBean/hello33.xml");
		HelloApiDecorator bean = beans.getBean("beanc", HelloApiDecorator.class);
		bean.sayHello();
		HelloApiDecorator bean1 = beans.getBean("bean", HelloApiDecorator.class);
		bean1.sayHello();
	}
	
	@org.junit.Test
	public void testParent(){
		ApplicationContext parent = new ClassPathXmlApplicationContext("chart3/quoteBean/parent.xml");
		//注意此处加载父容器和子容器
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"chart3/quoteBean/hello33.xml"}, parent);
		HelloApiDecorator bean = context.getBean("parent", HelloApiDecorator.class);
		bean.sayHello();
	}

}

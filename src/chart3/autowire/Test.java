package chart3.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 自动装配
  * @ClassName: Test
  * @Description: TODO
  * @author junshuaizhang
  * @date 2016年8月15日 下午7:09:19
  *
 */
public class Test {
	
	@org.junit.Test
	public void byName(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("chart3/autowire/autowire.xml");
		HelloApi bean = classPathXmlApplicationContext.getBean("bean",HelloApi.class);
		bean.sayHello();
	}

	@org.junit.Test
	public void byType(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("chart3/autowire/autowire.xml");
		HelloApi bean = classPathXmlApplicationContext.getBean("byType",HelloApi.class);
		bean.sayHello();
	}
	
	@org.junit.Test
	public void byConstructor(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("chart3/autowire/autowire.xml");
		HelloApi bean = classPathXmlApplicationContext.getBean("byConstructor",HelloApi.class);
		bean.sayHello();
	}
}

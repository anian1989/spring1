package chart3.dependson;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@org.junit.Test
	public void testDependOn() throws IOException{
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("chart3/dependson/dependson.xml");
		//一定要注册销毁回调，否则我们定义的销毁方法不行
		classPathXmlApplicationContext.registerShutdownHook();
		
		DependentBean bean = classPathXmlApplicationContext.getBean("dependentBean",DependentBean.class);
		bean.write("aaaa");
	}

}

package chart3.methodInject.MethodReplacer;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chart3.methodInject.lookup.Printer;

public class testMethodReplacer {
	@Test
	public void test(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chart3/methodInject/MethodReplacer/methodreplace.xml");
		 Printer printer = context.getBean("printer", Printer.class);
		printer.print("我将被替换");
	}

}

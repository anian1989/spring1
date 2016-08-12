package chart3.part1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part1Test {

	@Test
	public void testIdref(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/part1/part1.xml");
		IdRefTestBean bean = beans.getBean("idrefBean1", IdRefTestBean.class);
		System.out.println(bean.getId());
		IdRefTestBean bean2 = beans.getBean("idrefBean2", IdRefTestBean.class);
		System.out.println(bean2.getId());
	}
}

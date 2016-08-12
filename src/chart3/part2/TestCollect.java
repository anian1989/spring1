package chart3.part2;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import junit.framework.Assert;

@ContextConfiguration(locations = {"chart3/part2/part2.xml"})
public class TestCollect {
	
	@Test
	public void testListBean(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/part2/part2.xml");
		ListTestBean bean = beans.getBean("listbean",ListTestBean.class);
		System.out.println(bean.getValues().size());
	}
	@Test
	public void testArrayBean(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/part2/part2.xml");
		ArrayTestBean bean = beans.getBean("arrayBean",ArrayTestBean.class);
		System.out.println(bean.getArray()[0]);
		System.out.println(bean.getArray2()[1][1]);
	}
	@Test
	public void testMapBean(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/part2/part2.xml");
		MapTestBean bean = beans.getBean("mapBean",MapTestBean.class);
		System.out.println(bean.getValues().get("2"));
	}
	
	@Test
	public void testPropertiesBean(){
		BeanFactory beans = new ClassPathXmlApplicationContext("chart3/part2/part2.xml");
		PropertiesTestBean bean = beans.getBean("propertiesBean",PropertiesTestBean.class);
		System.out.println(bean.getValues().get("2"));
		System.out.println(bean.getValues1().get("a"));
	}

}

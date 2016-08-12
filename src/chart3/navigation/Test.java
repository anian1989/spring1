package chart3.navigation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@org.junit.Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("chart3/navigation/hello4.xml");
		NavigationA bean = context.getBean("a",NavigationA.class);
		bean.getNavigationB().getNavigationC().sayNavigation();
		bean.getNavigationB().getList().get(0).sayNavigation();
		bean.getNavigationB().getMap().get("aaaa").sayNavigation();
		bean.getNavigationB().getArray()[0].sayNavigation();
		((NavigationC)bean.getNavigationB().getProperties().get("1")).sayNavigation();
		
	}

}

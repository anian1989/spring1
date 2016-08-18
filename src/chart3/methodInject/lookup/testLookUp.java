package chart3.methodInject.lookup;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
		 一、查找方法注入：又称为Lookup方法注入，用于注入方法返回结果，也就是说能通过配置方式替换方法返回结果。
		使用<lookup-method name="方法名" bean="bean名字"/>配置；其中name属性指定方法名，bean属性指定方法
		需返回的Bean。
		方法定义格式：访问级别必须是public或protected，保证能被子类重载，可以是抽象方法，必须有返回值，必须是无
		参数方法，查找方法的类和被重载的方法必须为非final：
		<public|protected> [abstract] <return-type> theMethodName(no-arguments);
		因为“singleton”Bean在容器中只有一个实例，而“prototype”Bean是每次获取容器都返回一个全新的实例，所以
		如果“singleton”Bean在使用“prototype” Bean情况时，那么“prototype”Bean由于是“singleton”Bean的一
		个字段属性，所以获取的这个“prototype”Bean就和它所在的“singleton”Bean具有同样的生命周期，所以不是我
		们所期待的结果。因此查找方法注入就是用于解决这个问题。
  * @ClassName: testLookUp
  * @Description: TODO
  * @author junshuaizhang
  * @date 2016年8月18日 下午5:52:52
  *
 */
public class testLookUp {

	@Test
	public void testLookUp() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"chart3/methodInject/lookup/lookup.xml");
		System.out.println("=======singleton sayHello======");
		HellpApi helloApi1 = context.getBean("helloApi1", HellpApi.class);
		helloApi1.sayHello();

		helloApi1 = context.getBean("helloApi1", HellpApi.class);
		helloApi1.sayHello();
		System.out.println("=======prototype sayHello======");
		HellpApi helloApi2 = context.getBean("helloApi2", HellpApi.class);
		helloApi2.sayHello();
		helloApi2 = context.getBean("helloApi2", HellpApi.class);
		helloApi2.sayHello();
	}

}

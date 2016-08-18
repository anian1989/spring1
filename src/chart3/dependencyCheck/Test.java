package chart3.dependencyCheck;

import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 依赖检查
 * Spring3+也不推荐配置方式依赖检查了，建议采用Java5+ @Required注解方式，测试时请将XML schema降低为2.5
	版本的，和自动装配中“autodetect”配置方式的xsd一样。
  * @ClassName: Test
  * @Description: TODO
  * @author junshuaizhang
  * @date 2016年8月15日 下午7:09:19
  *
 */
public class Test {
	
	@org.junit.Test(expected = UnsatisfiedDependencyException.class)
	public void objects(){
		new ClassPathXmlApplicationContext("chart3/dependencyCheck/check.xml");
		
	}

	
}

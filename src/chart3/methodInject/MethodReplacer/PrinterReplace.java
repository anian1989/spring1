package chart3.methodInject.MethodReplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class PrinterReplace implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Print Replacer");
		return null;
	}

}

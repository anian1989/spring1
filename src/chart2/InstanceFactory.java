package chart2;

public class InstanceFactory {
	
	public HelloApi2 newInstance(String message,int index){
		return new HelloImpl2(message,index);
	}

}

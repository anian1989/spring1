package chart2;

public class StaticFactory {

	public static HelloApi2 newInstance(String meassage,int index){
		return new HelloImpl2(meassage,index);
	}
}

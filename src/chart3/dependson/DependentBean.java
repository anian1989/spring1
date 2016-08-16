package chart3.dependson;

import java.io.IOException;

public class DependentBean {
		ResourcBean bean;
		public void write(String ss) throws IOException{
			System.out.println("WDependentBean============写资源:::::::::::::");
			bean.getFos().write(ss.getBytes());
		}
		
		public void init() throws IOException{
			System.out.println("DependentBean============初始化::::::::");
			bean.getFos().write("DependentBean============初始化::::::::::".getBytes());
		}
		public void destroy() throws IOException{
			System.out.println("DependentBean============销毁:::::::::");
			bean.getFos().write("DependentBean============销毁:::::::::::".getBytes());
		}

		public void setBean(ResourcBean bean) {
			this.bean = bean;
		}
		
		
}

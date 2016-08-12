package chart3.dependson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourcBean {
	private FileOutputStream fos;
	private File file;
	
	public void init(){
		System.out.println("==============初始化============");
		//此处加载资源
		System.out.println("==============初始化：加载资源");
		try {
			this.fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void destroy(){
		System.out.println("==========销毁==========");
		//释放资源
		System.out.println("==========销毁：释放资源");
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public FileOutputStream getFos() {
		return fos;
	}
	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}

}

package chart3.methodInject.lookup;

public abstract class HelloApiImpl implements chart3.methodInject.lookup.HellpApi{

	private Printer printer;
	@Override
	public void sayHello() {
		printer.print("setter");
		createPrototypePrinter().print("prototype");
		createSingletonPrinter().print("singleton");
	}
	
	public abstract Printer createPrototypePrinter();
	
	public Printer createSingletonPrinter(){
		System.out.println("该方法不会被执行，如果输出就错了");
		return new Printer();
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

}

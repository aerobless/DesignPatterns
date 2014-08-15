package ch.theowinter.builder;

/* Product */
class Computer {
	private double cpuClock;
	private String manufacturer;
	private int hddSize;
	
	public void setCpuClock(double cpuClock) {
		this.cpuClock = cpuClock;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setHddSize(int hddSize) {
		this.hddSize = hddSize;
	}
	public double getCpuClock() {
		return cpuClock;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getHddSize() {
		return hddSize;
	}
}

/* Abstract Builder */
abstract class ComputerBuilder {
	protected Computer computer;
	
	public Computer getComputer(){
		return computer;
	}
	
	public void createNewComputer(){
		computer = new Computer();
	}
	
	public abstract void setCpu();
	public abstract void setManufatorer();
	public abstract void setHddSize();
}

/* ConcreteBuilder */
class AppleComputerBuilder extends ComputerBuilder {

	@Override
	public void setCpu() {
		computer.setCpuClock(3.2);
	}

	@Override
	public void setManufatorer() {
		computer.setManufacturer("Apple");
	}

	@Override
	public void setHddSize() {
		computer.setHddSize(1000);
	}
}

/* ConcreteBuilder */
class AsusComputerBuilder extends ComputerBuilder {

	@Override
	public void setCpu() {
		computer.setCpuClock(2.2);
	}

	@Override
	public void setManufatorer() {
		computer.setManufacturer("Asus");
	}

	@Override
	public void setHddSize() {
		computer.setHddSize(500);
	}
}

/* Director */
class ComputerStore {
	private ComputerBuilder computerBuilder;
	
	public void setComputerBuilder(ComputerBuilder cb){
		computerBuilder = cb;
	}
	
	public Computer getComputer(){
		return computerBuilder.getComputer();
	}
	
	public void constructComputer(){
		computerBuilder.createNewComputer();
		computerBuilder.setCpu();
		computerBuilder.setHddSize();
		computerBuilder.setManufatorer();
	}
}

/* A customer buying a computer */
public class BuilderExample {

	public static void main(String[] args) {
		ComputerStore digitec = new ComputerStore();
		ComputerBuilder appleBuilder = new AppleComputerBuilder();
		ComputerBuilder asusBuilder = new AsusComputerBuilder();
		
		digitec.setComputerBuilder(appleBuilder);
		digitec.constructComputer();
		Computer computer = digitec.getComputer();
		
		digitec.setComputerBuilder(asusBuilder);
		digitec.constructComputer();
		Computer someOtherComputer = digitec.getComputer();
		
		//Check
		System.out.println(computer.getManufacturer()+" Computer with "+computer.getCpuClock()+" Ghz CPU and "+computer.getHddSize()+"GB HDD.");
		System.out.println(someOtherComputer.getManufacturer()+" Computer with "+someOtherComputer.getCpuClock()+" Ghz CPU and "+someOtherComputer.getHddSize()+"GB HDD.");
	}

}
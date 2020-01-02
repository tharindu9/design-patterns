interface Car {
	void driverCar();
}

class CarImpl implements Car {

	public void driverCar() {
		System.out.println(" be a polite driver ");
	}
}

class ProxyCar implements Car {

	private Driver driver;
	private Car car;

	ProxyCar(Driver driver) {
		setDriver(driver);
		setCar(this);
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		if(driver == null){
			throw new IllegalArgumentException("driver can not be null");
		}
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		if(driver == null){
			throw new IllegalArgumentException("Car can not be null");
		}
		this.car = car;
	}

	public void driverCar() {
		if (this.driver.getAge() < 18) {
			System.out.println("you dnt have permission ");
		} else {
			System.out.println("Wellcome to driving seat");
		}

	}
}

class Driver {

	private int age;

	Driver(int age) {
		setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Main1 {
	public static void main(String[] args) throws Exception {

		Car car = new ProxyCar(null);
		car.driverCar();
	}
}

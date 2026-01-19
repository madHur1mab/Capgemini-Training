package aggregation_composition;

public class Car {
		private Engine engine;
		private Driver driver;

		public Car() {
			engine = new Engine();
		}

		public Engine getEngine() {
			return engine;
		}

		public Driver getDriver() {
			return driver;
		}

		public void setDriver(Driver driver) {
			this.driver = driver; 
		}

		public static void main(String[] args) {

			Car car = new Car();

			car.engine.start();
			
			
			car.setDriver(new Driver());
			car.getDriver().drive();
		}

		public static class Engine {
			public void start() {
				System.out.println("Engine is starting");
			}
		}
		public static class Driver {
			public void drive() {
				System.out.println("Driver is driving the car");
			}
		}
}

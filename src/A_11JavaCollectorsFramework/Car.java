package A_11JavaCollectorsFramework;

import java.util.HashMap;
import java.util.Map;

public class Car {
	/**
	 * Fields of our car
	 */
	private final String model;
	private final String register;
	private final String brand;
	private final int yearOfSale;

	/**
	 * Constructor
	 * @param model model of the car
	 * @param register of the car
	 * @param brand that made the car
	 * @param yearOfSale oof the car
	 */
	public Car(String model, String register, String brand, int yearOfSale) {
		this.model = model;
		this.register = register;
		this.brand = brand;
		this.yearOfSale = yearOfSale;
	}

	/**
	 * Getters
	 * @return the different fields of the car
	 */
	public String getRegister() {
		return register;
	}

	public String getBrand() {
		return brand;
	}

	public int getYearOfSale() {
		return yearOfSale;
	}

	public String getModel() {
		return model;
	}

	/**
	 * Prints all the elements inside a map containing cars instances
	 * @param cars a map containing car instances
	 */
	public static void printCars(Map<String, Car> cars){
		System.out.println("\n");
		for (Car car : cars.values()) {
			System.out.println(car);
		}
	}

	/**
	 *
	 * @return the information of the car
	 */
	@Override
	public String toString() {
		return getModel()+" |\tBrand: "+getBrand()+" |\tRegister: "+getRegister()+" |\tYear of sale: "+getYearOfSale();
	}

	/**
	 *
	 * Test
	 */
	public static void main(String[] args) {
		//We create a new map that will contain Cars instances
		Map<String, Car> mapCars = new HashMap<>();
		//We instance some cars
		Car a = new Car("Model X","AA-00-AA","Tesla",2018);
		Car b = new Car("CyberTruck","AA-11-AA","Tesla",1988);
		Car c = new Car("Fiesta","AA-22-AA","Fiat",2020);
		Car d = new Car("Corsa","AA-33-AA","Opel",1387);
		//We add the cars to our map using the registration as a key for our HashMap
		mapCars.put(a.getRegister(),a);
		mapCars.put(d.getRegister(),d);
		mapCars.put(b.getRegister(),b);
		mapCars.put(c.getRegister(),c);
		//We print the cars inside the map
		printCars(mapCars);
		//We remove the car d from our map, using the key of the registration
		mapCars.remove("AA-33-AA");
		//We remove the car a from our map, using the key of the registration
		mapCars.remove("AA-00-AA");
		//We print the map
		printCars(mapCars);
		//We print an specific car using the registration as a key to look for it, car c
		System.out.println("\n"+mapCars.get("AA-22-AA"));

	}
}

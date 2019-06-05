package lt.viko.eif.s031900.webservice;

import java.util.List;
import java.util.ArrayList;
import javax.jws.WebService;

@WebService(endpointInterface = "lt.viko.eif.s031900.webservice.MyService")
public class MyServiceImpl implements MyService {

	public String helloWorld(String name) {
		return "Hello world from " + name;
	}

	public List<Car> carList = new ArrayList<Car>();
	public List<Human> humanList = new ArrayList<Human>();

	public Human newHuman(int ID, int age, String name, String surname) {
		Human human = new Human();
		human.setID(ID);
		human.setName(name);
		human.setSurname(surname);
		human.setAge(age);
		humanList.add(human);
		return human;
	}

	public Car newCar(int ID, int plateNumber, String brand, String model) {
		Car car = new Car();
		car.setID(ID);
		car.setModel(model);
		car.setPlateNumber(plateNumber);
		car.setType(brand);
		carList.add(car);
		return car;
	}

	public List<Car> getCars(int humanId) {
		for (Human human : humanList) {
			if (human.getID() == humanId) {
				return human.getCars();
			}
		}
		return null;
	}
	
	public boolean addCar(int humanId, int carId) {
		for (Human human : humanList) {
			if (human.getID() == humanId) {
				for (Car car : carList) {
					if (car.getID() == carId) {
						human.addCar(car);
						return true;
					}
				}
			}
		}
		return false;
	}
}
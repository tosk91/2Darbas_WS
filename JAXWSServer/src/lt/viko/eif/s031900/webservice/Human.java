package lt.viko.eif.s031900.webservice;

import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.ArrayList;

/**
 * A class describing an object of type 'Human' 02-20-2019
 * 
 * @author s031900
 * @version 1.0
 */
@XmlRootElement(name = "Human")
public class Human {
	
	private int ID;
	private int age;
	
	private String name;
	
	private String surname;
	private List<Car> cars = new ArrayList<Car>();

	/**
	 * @param ID ID
	 * @param age amzius
	 * @param name vardas
	 * @param surname pavarde
	 */
	public Human() {
		
	}
	
	/**
	 * @param age sets a person's age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param id sets a person's id
	 */
	public void setID(int id) {
		this.ID = id;
	}

	/**
	 * @param name sets a name for a new person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param surname sets a surname for a persn
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return returns a list of owned cars
	 */
	@XmlElement(name = "cars")
	public List<Car> getCars() {
		return cars;
	}

	/**
	 * @return returns human's age
	 */
	@XmlElement(name = "age")
	public int getAge() {
		return age;
	}

	/**
	 * @return returns a Human's age
	 */
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	/**
	 * @return returns a Human's surname
	 */
	@XmlElement(name = "surname")
	public String getSurname() {
		return surname;
	}
	/**
	 * @return returns a Human's ID
	 */
	@XmlElement(name = "ID")
	public int getID() {
		return ID;
	}
	/**
	 * adds a new car to the list
	 * 
	 * @param car a car that's being added to the list
	 */
	public void addCar(Car car) {
		cars.add(car);
	}
	
	@Override
	public String toString() {
		return cars + name + " " + surname + ", " + age;
	}
}

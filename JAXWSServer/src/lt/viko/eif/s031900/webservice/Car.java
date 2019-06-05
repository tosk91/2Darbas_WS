package lt.viko.eif.s031900.webservice;
import javax.xml.bind.annotation.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
/**
 * A class describing an object of type 'Car'
 * 
 * @author s031900
 * @version 1.0
 */
@XmlRootElement(name = "Car-class")
public class Car {
	private int ID;
	private int plateNumber;
	private String brand;
	private String model;

	/**
	 * @param plateNumber Valstybinis numeris
	 * @param brand        automobilio marke
	 * @param model       automobilio modelis
	 */
	public Car() {
		
	}
	
	public Car (int ID, int plateNumber, String type, String model) {
		this.ID = ID;
		this.plateNumber = plateNumber;
		this.brand = type;
		this.model = model;
	}
	/**
	 * @param ID sets a car's ID
	 */
	public void setID (int ID) {
		this.ID = ID;
	}

	/**
	 * @param plateNumber sets a car's plate number
	 */
	public void setPlateNumber(int plateNumber) {
		this.plateNumber = plateNumber;
	}

	/**
	 * @return returns the plate number of the car
	 */
	@XmlElement(name = "plate-number")
	public int getPlateNumber() {
		return plateNumber;
	}

	/**
	 * @param type sets a car's type
	 */
	public void setType(String type) {
		this.brand = type;
	}

	/**
	 * @return returns the type of car
	 */
	@XmlElement(name = "car-type")
	public String getType() {
		return brand;
	}

	/**
	 * @param model sets a car's model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return returns the model of the car
	 */
	@XmlElement(name = "car-model")
	public String getModel() {
		return model;
	}
	/**
	 * @return returns the ID of the car
	 */
	@XmlElement(name = "car-id")
	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "\n" + plateNumber + ", " + brand + " " + model;
	}
}

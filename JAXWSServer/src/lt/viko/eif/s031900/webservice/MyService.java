package lt.viko.eif.s031900.webservice;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
 
@WebService
public interface MyService {
 
 @WebMethod public String helloWorld(String name);
 //@WebMethod public String getHuman(int age, String name, String surName);
 @WebMethod public Human newHuman(int ID, int age, String name, String surname);
 @WebMethod public Car newCar(int ID, int plateNumber, String brand, String model);
 @WebMethod public List<Car> getCars(int humanId);
 @WebMethod public boolean addCar(int humanId, int carId);
}
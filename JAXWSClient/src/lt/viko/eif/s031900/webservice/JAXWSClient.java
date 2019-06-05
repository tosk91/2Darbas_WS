package lt.viko.eif.s031900.webservice;

import lt.viko.eif.s031900.webservice.Car;
import lt.viko.eif.s031900.webservice.MyService;
import lt.viko.eif.s031900.webservice.MyServiceImplService;
import lt.viko.eif.s031900.webservice.Human;
 
public class JAXWSClient {
 
    /**
     * @author Tomas Skamarocius
     */
    public static void main(String[] args) {
        
        MyServiceImplService myServiceImpl = new MyServiceImplService();
        MyService myService = myServiceImpl.getMyServiceImplPort();
        System.out.println(myService.helloWorld("Tomas"));
        
        Human hm1 = myService.newHuman(28, "Tomas", "Skamarocius");
        Human hm2 = myService.newHuman(23, "Vidas", "Salavejus");
        Human hm3 = myService.newHuman(20, "Marius", "Samoilenko");
        
        Car car1 = myService.newCar(123456, "Audi", "A6");
        Car car2 = myService.newCar(789098, "BMW", "X6");
        Car car3 = myService.newCar(654321, "VW", "Golf");
        
        hm1.getCars().add(car1); hm1.getCars().add(car2); hm1.getCars().add(car3);
        hm2.getCars().add(car2); hm2.getCars().add(car3);
        hm3.getCars().add(car3); hm3.getCars().add(car1);

        System.out.println(myService.getCars(hm1).toString());
        System.out.println(myService.getCars(hm2).toString());
        System.out.println(myService.getCars(hm3).toString());
    }
}
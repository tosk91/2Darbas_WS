
package lt.viko.eif.s031900.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.s031900.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCarsResponse_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "getCarsResponse");
    private final static QName _Human_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "Human");
    private final static QName _NewHumanResponse_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "newHumanResponse");
    private final static QName _HelloWorld_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "helloWorld");
    private final static QName _CarClass_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "Car-class");
    private final static QName _NewCarResponse_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "newCarResponse");
    private final static QName _NewCar_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "newCar");
    private final static QName _GetCars_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "getCars");
    private final static QName _NewHuman_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "newHuman");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://webservice.s031900.eif.viko.lt/", "helloWorldResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.s031900.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Human }
     * 
     */
    public Human createHuman() {
        return new Human();
    }

    /**
     * Create an instance of {@link NewHumanResponse }
     * 
     */
    public NewHumanResponse createNewHumanResponse() {
        return new NewHumanResponse();
    }

    /**
     * Create an instance of {@link GetCarsResponse }
     * 
     */
    public GetCarsResponse createGetCarsResponse() {
        return new GetCarsResponse();
    }

    /**
     * Create an instance of {@link GetCars }
     * 
     */
    public GetCars createGetCars() {
        return new GetCars();
    }

    /**
     * Create an instance of {@link NewHuman }
     * 
     */
    public NewHuman createNewHuman() {
        return new NewHuman();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link NewCarResponse }
     * 
     */
    public NewCarResponse createNewCarResponse() {
        return new NewCarResponse();
    }

    /**
     * Create an instance of {@link NewCar }
     * 
     */
    public NewCar createNewCar() {
        return new NewCar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "getCarsResponse")
    public JAXBElement<GetCarsResponse> createGetCarsResponse(GetCarsResponse value) {
        return new JAXBElement<GetCarsResponse>(_GetCarsResponse_QNAME, GetCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Human }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "Human")
    public JAXBElement<Human> createHuman(Human value) {
        return new JAXBElement<Human>(_Human_QNAME, Human.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewHumanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "newHumanResponse")
    public JAXBElement<NewHumanResponse> createNewHumanResponse(NewHumanResponse value) {
        return new JAXBElement<NewHumanResponse>(_NewHumanResponse_QNAME, NewHumanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "helloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Car }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "Car-class")
    public JAXBElement<Car> createCarClass(Car value) {
        return new JAXBElement<Car>(_CarClass_QNAME, Car.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "newCarResponse")
    public JAXBElement<NewCarResponse> createNewCarResponse(NewCarResponse value) {
        return new JAXBElement<NewCarResponse>(_NewCarResponse_QNAME, NewCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "newCar")
    public JAXBElement<NewCar> createNewCar(NewCar value) {
        return new JAXBElement<NewCar>(_NewCar_QNAME, NewCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "getCars")
    public JAXBElement<GetCars> createGetCars(GetCars value) {
        return new JAXBElement<GetCars>(_GetCars_QNAME, GetCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewHuman }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "newHuman")
    public JAXBElement<NewHuman> createNewHuman(NewHuman value) {
        return new JAXBElement<NewHuman>(_NewHuman_QNAME, NewHuman.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.s031900.eif.viko.lt/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

}

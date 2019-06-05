package lt.viko.eif.s031900.webservice;
import javax.xml.ws.Endpoint;
 
public class MyServiceWSPublisher {
 public static void main(String[] args) {
  Endpoint.publish("http://localhost:8081/WS/MyService",new MyServiceImpl());
 }
}
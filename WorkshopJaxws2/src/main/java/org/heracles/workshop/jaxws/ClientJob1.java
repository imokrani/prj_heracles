package org.heracles.workshop.jaxws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by MOKRANI on 23/04/2016.
 */
public class ClientJob1 {

    public static void main(String[] args) throws Exception
    {
    	System.out.println("Debut taitement");
        URL url = new URL("http://localhost:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://jaxws.workshop.heracles.org/", "WorkshopJAXWS_Job1ImplService");

        Service service = Service.create(url, qname);

        WorkshopJAXWS_Job1 hello = service.getPort(WorkshopJAXWS_Job1.class);

        System.out.println(hello.getHelloWorldAsString("Idir"));
    }
}

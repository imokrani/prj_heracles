package org.heracles.workshop.jaxws;

import javax.xml.ws.Endpoint;

/**
 * Created by MOKRANI on 23/04/2016.
 */
public class TestJob1 {

    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:9999/ws/hello", new WorkshopJAXWS_Job1Impl());
    }
}

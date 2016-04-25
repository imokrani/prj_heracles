package org.heracles.workshop.jaxws;

import javax.jws.WebService;

/**
 * Created by MOKRANI on 23/04/2016.
 */
@WebService(endpointInterface = "org.heracles.workshop.jaxws.WorkshopJAXWS_Job1")
public class WorkshopJAXWS_Job1Impl implements WorkshopJAXWS_Job1
{

    public String getHelloWorldAsString(String name) {
        return "Bonjour Mr " +name;
    }
}

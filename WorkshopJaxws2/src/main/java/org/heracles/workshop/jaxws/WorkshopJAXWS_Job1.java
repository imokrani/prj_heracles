package org.heracles.workshop.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by MOKRANI on 23/04/2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WorkshopJAXWS_Job1
{
    @WebMethod String getHelloWorldAsString(String name);
}

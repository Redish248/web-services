
package itmo.ws.impl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IllegalRequestParameterException", targetNamespace = "http://impl.ws.itmo/")
public class IllegalRequestParameterException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CatServiceFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IllegalRequestParameterException(String message, CatServiceFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IllegalRequestParameterException(String message, CatServiceFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: itmo.ws.impl.CatServiceFault
     */
    public CatServiceFault getFaultInfo() {
        return faultInfo;
    }

}

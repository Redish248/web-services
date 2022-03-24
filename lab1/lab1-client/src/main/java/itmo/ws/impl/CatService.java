
package itmo.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CatService", targetNamespace = "http://impl.ws.itmo/", wsdlLocation = "http://localhost:8080/CatService?wsdl")
public class CatService
    extends Service
{

    private final static URL CATSERVICE_WSDL_LOCATION;
    private final static WebServiceException CATSERVICE_EXCEPTION;
    private final static QName CATSERVICE_QNAME = new QName("http://impl.ws.itmo/", "CatService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CatService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CATSERVICE_WSDL_LOCATION = url;
        CATSERVICE_EXCEPTION = e;
    }

    public CatService() {
        super(__getWsdlLocation(), CATSERVICE_QNAME);
    }

    public CatService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CATSERVICE_QNAME, features);
    }

    public CatService(URL wsdlLocation) {
        super(wsdlLocation, CATSERVICE_QNAME);
    }

    public CatService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CATSERVICE_QNAME, features);
    }

    public CatService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CatService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CatWebServiceImpl
     */
    @WebEndpoint(name = "CatWebServiceImplPort")
    public CatWebServiceImpl getCatWebServiceImplPort() {
        return super.getPort(new QName("http://impl.ws.itmo/", "CatWebServiceImplPort"), CatWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CatWebServiceImpl
     */
    @WebEndpoint(name = "CatWebServiceImplPort")
    public CatWebServiceImpl getCatWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.ws.itmo/", "CatWebServiceImplPort"), CatWebServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CATSERVICE_EXCEPTION!= null) {
            throw CATSERVICE_EXCEPTION;
        }
        return CATSERVICE_WSDL_LOCATION;
    }

}
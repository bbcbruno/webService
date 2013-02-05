
package br.com.ws.customerservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ws.customerservice package. 
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

    private final static QName _UpdateCustomer_QNAME = new QName("http://customerservice.example.com/service", "updateCustomer");
    private final static QName _GetCustomerByIdResponse_QNAME = new QName("http://customerservice.example.com/service", "getCustomerByIdResponse");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://customerservice.example.com/service", "updateCustomerResponse");
    private final static QName _DeleteCustomerById_QNAME = new QName("http://customerservice.example.com/service", "deleteCustomerById");
    private final static QName _NoSuchCustomer_QNAME = new QName("http://customerservice.example.com/service", "NoSuchCustomer");
    private final static QName _GetCustomerById_QNAME = new QName("http://customerservice.example.com/service", "getCustomerById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ws.customerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoSuchCustomer }
     * 
     */
    public NoSuchCustomer createNoSuchCustomer() {
        return new NoSuchCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerById }
     * 
     */
    public GetCustomerById createGetCustomerById() {
        return new GetCustomerById();
    }

    /**
     * Create an instance of {@link DeleteCustomerById }
     * 
     */
    public DeleteCustomerById createDeleteCustomerById() {
        return new DeleteCustomerById();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByIdResponse }
     * 
     */
    public GetCustomerByIdResponse createGetCustomerByIdResponse() {
        return new GetCustomerByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/service", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/service", name = "getCustomerByIdResponse")
    public JAXBElement<GetCustomerByIdResponse> createGetCustomerByIdResponse(GetCustomerByIdResponse value) {
        return new JAXBElement<GetCustomerByIdResponse>(_GetCustomerByIdResponse_QNAME, GetCustomerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/service", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/service", name = "deleteCustomerById")
    public JAXBElement<DeleteCustomerById> createDeleteCustomerById(DeleteCustomerById value) {
        return new JAXBElement<DeleteCustomerById>(_DeleteCustomerById_QNAME, DeleteCustomerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/service", name = "NoSuchCustomer")
    public JAXBElement<NoSuchCustomer> createNoSuchCustomer(NoSuchCustomer value) {
        return new JAXBElement<NoSuchCustomer>(_NoSuchCustomer_QNAME, NoSuchCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/service", name = "getCustomerById")
    public JAXBElement<GetCustomerById> createGetCustomerById(GetCustomerById value) {
        return new JAXBElement<GetCustomerById>(_GetCustomerById_QNAME, GetCustomerById.class, null, value);
    }

}

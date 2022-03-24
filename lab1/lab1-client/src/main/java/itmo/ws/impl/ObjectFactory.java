
package itmo.ws.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the itmo.ws.impl package. 
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

    private final static QName _GetCatsByOwnerAndName_QNAME = new QName("http://impl.ws.itmo/", "getCatsByOwnerAndName");
    private final static QName _GetCatsResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsResponse");
    private final static QName _GetCatsByFullDescription_QNAME = new QName("http://impl.ws.itmo/", "getCatsByFullDescription");
    private final static QName _GetCatsByNameAndAgeResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByNameAndAgeResponse");
    private final static QName _GetCatsByNameResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByNameResponse");
    private final static QName _GetCatsByOwnerAndNameResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByOwnerAndNameResponse");
    private final static QName _GetCatsByDescriptionResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByDescriptionResponse");
    private final static QName _GetCatsByBreed_QNAME = new QName("http://impl.ws.itmo/", "getCatsByBreed");
    private final static QName _GetCatsByBreedAndOwnerResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByBreedAndOwnerResponse");
    private final static QName _GetCatByUidResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatByUidResponse");
    private final static QName _GetCatsByDescription_QNAME = new QName("http://impl.ws.itmo/", "getCatsByDescription");
    private final static QName _GetCatsByBreedAndOwner_QNAME = new QName("http://impl.ws.itmo/", "getCatsByBreedAndOwner");
    private final static QName _GetCatsByOwnerResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByOwnerResponse");
    private final static QName _GetCatsByOwner_QNAME = new QName("http://impl.ws.itmo/", "getCatsByOwner");
    private final static QName _GetCatsByFullDescriptionResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByFullDescriptionResponse");
    private final static QName _GetCatsByName_QNAME = new QName("http://impl.ws.itmo/", "getCatsByName");
    private final static QName _GetCatsByNameAndAge_QNAME = new QName("http://impl.ws.itmo/", "getCatsByNameAndAge");
    private final static QName _GetCatByUid_QNAME = new QName("http://impl.ws.itmo/", "getCatByUid");
    private final static QName _GetCats_QNAME = new QName("http://impl.ws.itmo/", "getCats");
    private final static QName _GetCatsByBreedResponse_QNAME = new QName("http://impl.ws.itmo/", "getCatsByBreedResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: itmo.ws.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCatsByOwnerResponse }
     * 
     */
    public GetCatsByOwnerResponse createGetCatsByOwnerResponse() {
        return new GetCatsByOwnerResponse();
    }

    /**
     * Create an instance of {@link GetCatsByOwner }
     * 
     */
    public GetCatsByOwner createGetCatsByOwner() {
        return new GetCatsByOwner();
    }

    /**
     * Create an instance of {@link GetCatByUidResponse }
     * 
     */
    public GetCatByUidResponse createGetCatByUidResponse() {
        return new GetCatByUidResponse();
    }

    /**
     * Create an instance of {@link GetCatsByDescription }
     * 
     */
    public GetCatsByDescription createGetCatsByDescription() {
        return new GetCatsByDescription();
    }

    /**
     * Create an instance of {@link GetCatsByBreedAndOwner }
     * 
     */
    public GetCatsByBreedAndOwner createGetCatsByBreedAndOwner() {
        return new GetCatsByBreedAndOwner();
    }

    /**
     * Create an instance of {@link GetCatsByBreedResponse }
     * 
     */
    public GetCatsByBreedResponse createGetCatsByBreedResponse() {
        return new GetCatsByBreedResponse();
    }

    /**
     * Create an instance of {@link GetCatsByFullDescriptionResponse }
     * 
     */
    public GetCatsByFullDescriptionResponse createGetCatsByFullDescriptionResponse() {
        return new GetCatsByFullDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetCatsByName }
     * 
     */
    public GetCatsByName createGetCatsByName() {
        return new GetCatsByName();
    }

    /**
     * Create an instance of {@link GetCatsByNameAndAge }
     * 
     */
    public GetCatsByNameAndAge createGetCatsByNameAndAge() {
        return new GetCatsByNameAndAge();
    }

    /**
     * Create an instance of {@link GetCatByUid }
     * 
     */
    public GetCatByUid createGetCatByUid() {
        return new GetCatByUid();
    }

    /**
     * Create an instance of {@link GetCats }
     * 
     */
    public GetCats createGetCats() {
        return new GetCats();
    }

    /**
     * Create an instance of {@link GetCatsByFullDescription }
     * 
     */
    public GetCatsByFullDescription createGetCatsByFullDescription() {
        return new GetCatsByFullDescription();
    }

    /**
     * Create an instance of {@link GetCatsByNameAndAgeResponse }
     * 
     */
    public GetCatsByNameAndAgeResponse createGetCatsByNameAndAgeResponse() {
        return new GetCatsByNameAndAgeResponse();
    }

    /**
     * Create an instance of {@link GetCatsByNameResponse }
     * 
     */
    public GetCatsByNameResponse createGetCatsByNameResponse() {
        return new GetCatsByNameResponse();
    }

    /**
     * Create an instance of {@link GetCatsByOwnerAndName }
     * 
     */
    public GetCatsByOwnerAndName createGetCatsByOwnerAndName() {
        return new GetCatsByOwnerAndName();
    }

    /**
     * Create an instance of {@link GetCatsResponse }
     * 
     */
    public GetCatsResponse createGetCatsResponse() {
        return new GetCatsResponse();
    }

    /**
     * Create an instance of {@link GetCatsByDescriptionResponse }
     * 
     */
    public GetCatsByDescriptionResponse createGetCatsByDescriptionResponse() {
        return new GetCatsByDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetCatsByBreed }
     * 
     */
    public GetCatsByBreed createGetCatsByBreed() {
        return new GetCatsByBreed();
    }

    /**
     * Create an instance of {@link GetCatsByBreedAndOwnerResponse }
     * 
     */
    public GetCatsByBreedAndOwnerResponse createGetCatsByBreedAndOwnerResponse() {
        return new GetCatsByBreedAndOwnerResponse();
    }

    /**
     * Create an instance of {@link GetCatsByOwnerAndNameResponse }
     * 
     */
    public GetCatsByOwnerAndNameResponse createGetCatsByOwnerAndNameResponse() {
        return new GetCatsByOwnerAndNameResponse();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByOwnerAndName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByOwnerAndName")
    public JAXBElement<GetCatsByOwnerAndName> createGetCatsByOwnerAndName(GetCatsByOwnerAndName value) {
        return new JAXBElement<GetCatsByOwnerAndName>(_GetCatsByOwnerAndName_QNAME, GetCatsByOwnerAndName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsResponse")
    public JAXBElement<GetCatsResponse> createGetCatsResponse(GetCatsResponse value) {
        return new JAXBElement<GetCatsResponse>(_GetCatsResponse_QNAME, GetCatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByFullDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByFullDescription")
    public JAXBElement<GetCatsByFullDescription> createGetCatsByFullDescription(GetCatsByFullDescription value) {
        return new JAXBElement<GetCatsByFullDescription>(_GetCatsByFullDescription_QNAME, GetCatsByFullDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByNameAndAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByNameAndAgeResponse")
    public JAXBElement<GetCatsByNameAndAgeResponse> createGetCatsByNameAndAgeResponse(GetCatsByNameAndAgeResponse value) {
        return new JAXBElement<GetCatsByNameAndAgeResponse>(_GetCatsByNameAndAgeResponse_QNAME, GetCatsByNameAndAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByNameResponse")
    public JAXBElement<GetCatsByNameResponse> createGetCatsByNameResponse(GetCatsByNameResponse value) {
        return new JAXBElement<GetCatsByNameResponse>(_GetCatsByNameResponse_QNAME, GetCatsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByOwnerAndNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByOwnerAndNameResponse")
    public JAXBElement<GetCatsByOwnerAndNameResponse> createGetCatsByOwnerAndNameResponse(GetCatsByOwnerAndNameResponse value) {
        return new JAXBElement<GetCatsByOwnerAndNameResponse>(_GetCatsByOwnerAndNameResponse_QNAME, GetCatsByOwnerAndNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByDescriptionResponse")
    public JAXBElement<GetCatsByDescriptionResponse> createGetCatsByDescriptionResponse(GetCatsByDescriptionResponse value) {
        return new JAXBElement<GetCatsByDescriptionResponse>(_GetCatsByDescriptionResponse_QNAME, GetCatsByDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByBreed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByBreed")
    public JAXBElement<GetCatsByBreed> createGetCatsByBreed(GetCatsByBreed value) {
        return new JAXBElement<GetCatsByBreed>(_GetCatsByBreed_QNAME, GetCatsByBreed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByBreedAndOwnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByBreedAndOwnerResponse")
    public JAXBElement<GetCatsByBreedAndOwnerResponse> createGetCatsByBreedAndOwnerResponse(GetCatsByBreedAndOwnerResponse value) {
        return new JAXBElement<GetCatsByBreedAndOwnerResponse>(_GetCatsByBreedAndOwnerResponse_QNAME, GetCatsByBreedAndOwnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatByUidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatByUidResponse")
    public JAXBElement<GetCatByUidResponse> createGetCatByUidResponse(GetCatByUidResponse value) {
        return new JAXBElement<GetCatByUidResponse>(_GetCatByUidResponse_QNAME, GetCatByUidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByDescription")
    public JAXBElement<GetCatsByDescription> createGetCatsByDescription(GetCatsByDescription value) {
        return new JAXBElement<GetCatsByDescription>(_GetCatsByDescription_QNAME, GetCatsByDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByBreedAndOwner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByBreedAndOwner")
    public JAXBElement<GetCatsByBreedAndOwner> createGetCatsByBreedAndOwner(GetCatsByBreedAndOwner value) {
        return new JAXBElement<GetCatsByBreedAndOwner>(_GetCatsByBreedAndOwner_QNAME, GetCatsByBreedAndOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByOwnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByOwnerResponse")
    public JAXBElement<GetCatsByOwnerResponse> createGetCatsByOwnerResponse(GetCatsByOwnerResponse value) {
        return new JAXBElement<GetCatsByOwnerResponse>(_GetCatsByOwnerResponse_QNAME, GetCatsByOwnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByOwner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByOwner")
    public JAXBElement<GetCatsByOwner> createGetCatsByOwner(GetCatsByOwner value) {
        return new JAXBElement<GetCatsByOwner>(_GetCatsByOwner_QNAME, GetCatsByOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByFullDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByFullDescriptionResponse")
    public JAXBElement<GetCatsByFullDescriptionResponse> createGetCatsByFullDescriptionResponse(GetCatsByFullDescriptionResponse value) {
        return new JAXBElement<GetCatsByFullDescriptionResponse>(_GetCatsByFullDescriptionResponse_QNAME, GetCatsByFullDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByName")
    public JAXBElement<GetCatsByName> createGetCatsByName(GetCatsByName value) {
        return new JAXBElement<GetCatsByName>(_GetCatsByName_QNAME, GetCatsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByNameAndAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByNameAndAge")
    public JAXBElement<GetCatsByNameAndAge> createGetCatsByNameAndAge(GetCatsByNameAndAge value) {
        return new JAXBElement<GetCatsByNameAndAge>(_GetCatsByNameAndAge_QNAME, GetCatsByNameAndAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatByUid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatByUid")
    public JAXBElement<GetCatByUid> createGetCatByUid(GetCatByUid value) {
        return new JAXBElement<GetCatByUid>(_GetCatByUid_QNAME, GetCatByUid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCats")
    public JAXBElement<GetCats> createGetCats(GetCats value) {
        return new JAXBElement<GetCats>(_GetCats_QNAME, GetCats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByBreedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.itmo/", name = "getCatsByBreedResponse")
    public JAXBElement<GetCatsByBreedResponse> createGetCatsByBreedResponse(GetCatsByBreedResponse value) {
        return new JAXBElement<GetCatsByBreedResponse>(_GetCatsByBreedResponse_QNAME, GetCatsByBreedResponse.class, null, value);
    }

}

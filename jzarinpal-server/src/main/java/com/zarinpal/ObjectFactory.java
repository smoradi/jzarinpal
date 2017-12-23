
package com.zarinpal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zarinpal package. 
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

    private final static QName _PaymentRequestWithExtraEmail_QNAME = new QName("http://zarinpal.com/", "Email");
    private final static QName _PaymentRequestWithExtraMobile_QNAME = new QName("http://zarinpal.com/", "Mobile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zarinpal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentRequestResponse }
     * 
     */
    public PaymentRequestResponse createPaymentRequestResponse() {
        return new PaymentRequestResponse();
    }

    /**
     * Create an instance of {@link PaymentVerificationResponse }
     * 
     */
    public PaymentVerificationResponse createPaymentVerificationResponse() {
        return new PaymentVerificationResponse();
    }

    /**
     * Create an instance of {@link RefreshAuthorityResponse }
     * 
     */
    public RefreshAuthorityResponse createRefreshAuthorityResponse() {
        return new RefreshAuthorityResponse();
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link RefreshAuthority }
     * 
     */
    public RefreshAuthority createRefreshAuthority() {
        return new RefreshAuthority();
    }

    /**
     * Create an instance of {@link PaymentRequestWithExtra }
     * 
     */
    public PaymentRequestWithExtra createPaymentRequestWithExtra() {
        return new PaymentRequestWithExtra();
    }

    /**
     * Create an instance of {@link PaymentVerification }
     * 
     */
    public PaymentVerification createPaymentVerification() {
        return new PaymentVerification();
    }

    /**
     * Create an instance of {@link PaymentVerificationWithExtra }
     * 
     */
    public PaymentVerificationWithExtra createPaymentVerificationWithExtra() {
        return new PaymentVerificationWithExtra();
    }

    /**
     * Create an instance of {@link GetUnverifiedTransactionsResponse }
     * 
     */
    public GetUnverifiedTransactionsResponse createGetUnverifiedTransactionsResponse() {
        return new GetUnverifiedTransactionsResponse();
    }

    /**
     * Create an instance of {@link GetUnverifiedTransactions }
     * 
     */
    public GetUnverifiedTransactions createGetUnverifiedTransactions() {
        return new GetUnverifiedTransactions();
    }

    /**
     * Create an instance of {@link PaymentVerificationWithExtraResponse }
     * 
     */
    public PaymentVerificationWithExtraResponse createPaymentVerificationWithExtraResponse() {
        return new PaymentVerificationWithExtraResponse();
    }

    /**
     * Create an instance of {@link PaymentRequestWithExtraResponse }
     * 
     */
    public PaymentRequestWithExtraResponse createPaymentRequestWithExtraResponse() {
        return new PaymentRequestWithExtraResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zarinpal.com/", name = "Email", scope = PaymentRequestWithExtra.class)
    public JAXBElement<String> createPaymentRequestWithExtraEmail(String value) {
        return new JAXBElement<String>(_PaymentRequestWithExtraEmail_QNAME, String.class, PaymentRequestWithExtra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zarinpal.com/", name = "Mobile", scope = PaymentRequestWithExtra.class)
    public JAXBElement<String> createPaymentRequestWithExtraMobile(String value) {
        return new JAXBElement<String>(_PaymentRequestWithExtraMobile_QNAME, String.class, PaymentRequestWithExtra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zarinpal.com/", name = "Email", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestEmail(String value) {
        return new JAXBElement<String>(_PaymentRequestWithExtraEmail_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zarinpal.com/", name = "Mobile", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestMobile(String value) {
        return new JAXBElement<String>(_PaymentRequestWithExtraMobile_QNAME, String.class, PaymentRequest.class, value);
    }

}


package com.zarinpal;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zarinpal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentRequest }
     *
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link PaymentVerification }
     *
     */
    public PaymentVerification createPaymentVerification() {
        return new PaymentVerification();
    }

    /**
     * Create an instance of {@link PaymentVerificationWithExtraResponse }
     *
     */
    public PaymentVerificationWithExtraResponse createPaymentVerificationWithExtraResponse() {
        return new PaymentVerificationWithExtraResponse();
    }

    /**
     * Create an instance of {@link PaymentVerificationWithExtra }
     *
     */
    public PaymentVerificationWithExtra createPaymentVerificationWithExtra() {
        return new PaymentVerificationWithExtra();
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
     * Create an instance of {@link PaymentRequestWithExtraResponse }
     *
     */
    public PaymentRequestWithExtraResponse createPaymentRequestWithExtraResponse() {
        return new PaymentRequestWithExtraResponse();
    }

    /**
     * Create an instance of {@link PaymentRequestWithExtra }
     *
     */
    public PaymentRequestWithExtra createPaymentRequestWithExtra() {
        return new PaymentRequestWithExtra();
    }

}
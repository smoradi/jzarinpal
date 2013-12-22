
package com.zarinpal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Authority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "merchantID",
    "authority",
    "amount"
})
@XmlRootElement(name = "PaymentVerification")
public class PaymentVerification {

    @XmlElement(name = "MerchantID", required = true)
    protected String merchantID;
    @XmlElement(name = "Authority", required = true)
    protected String authority;
    @XmlElement(name = "Amount")
    protected int amount;

    /**
     * Gets the value of the merchantID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the authority property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the amount property.
     *
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     */
    public void setAmount(int value) {
        this.amount = value;
    }

}
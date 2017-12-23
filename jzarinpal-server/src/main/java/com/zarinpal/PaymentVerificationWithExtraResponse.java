
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
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ExtraDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "status",
    "refID",
    "extraDetail"
})
@XmlRootElement(name = "PaymentVerificationWithExtraResponse")
public class PaymentVerificationWithExtraResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "RefID")
    protected long refID;
    @XmlElement(name = "ExtraDetail", required = true)
    protected String extraDetail;

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     */
    public long getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     */
    public void setRefID(long value) {
        this.refID = value;
    }

    /**
     * Gets the value of the extraDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraDetail() {
        return extraDetail;
    }

    /**
     * Sets the value of the extraDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraDetail(String value) {
        this.extraDetail = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.30 at 12:29:52 PM EEST 
//


package com.mg.mgclient;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPointTreeResult" type="{http://sb.com.ua/webservices/}FindRecordsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPointTreeResult"
})
@XmlRootElement(name = "GetPointTreeResponse")
public class GetPointTreeResponse {

    @XmlElement(name = "GetPointTreeResult")
    protected FindRecordsResponse getPointTreeResult;

    /**
     * Gets the value of the getPointTreeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FindRecordsResponse }
     *     
     */
    public FindRecordsResponse getGetPointTreeResult() {
        return getPointTreeResult;
    }

    /**
     * Sets the value of the getPointTreeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindRecordsResponse }
     *     
     */
    public void setGetPointTreeResult(FindRecordsResponse value) {
        this.getPointTreeResult = value;
    }

}

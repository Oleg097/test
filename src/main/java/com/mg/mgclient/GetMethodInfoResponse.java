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
 *         &lt;element name="GetMethodInfoResult" type="{http://sb.com.ua/webservices/}MethodInfo" minOccurs="0"/&gt;
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
    "getMethodInfoResult"
})
@XmlRootElement(name = "GetMethodInfoResponse")
public class GetMethodInfoResponse {

    @XmlElement(name = "GetMethodInfoResult")
    protected MethodInfo getMethodInfoResult;

    /**
     * Gets the value of the getMethodInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link MethodInfo }
     *     
     */
    public MethodInfo getGetMethodInfoResult() {
        return getMethodInfoResult;
    }

    /**
     * Sets the value of the getMethodInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodInfo }
     *     
     */
    public void setGetMethodInfoResult(MethodInfo value) {
        this.getMethodInfoResult = value;
    }

}
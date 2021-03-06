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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestFields" type="{http://sb.com.ua/webservices/}ArrayOfFieldInfo" minOccurs="0"/&gt;
 *         &lt;element name="ResponseFields" type="{http://sb.com.ua/webservices/}ArrayOfFieldInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodInfo", propOrder = {
    "description",
    "requestFields",
    "responseFields"
})
public class MethodInfo {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "RequestFields")
    protected ArrayOfFieldInfo requestFields;
    @XmlElement(name = "ResponseFields")
    protected ArrayOfFieldInfo responseFields;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the requestFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldInfo }
     *     
     */
    public ArrayOfFieldInfo getRequestFields() {
        return requestFields;
    }

    /**
     * Sets the value of the requestFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldInfo }
     *     
     */
    public void setRequestFields(ArrayOfFieldInfo value) {
        this.requestFields = value;
    }

    /**
     * Gets the value of the responseFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldInfo }
     *     
     */
    public ArrayOfFieldInfo getResponseFields() {
        return responseFields;
    }

    /**
     * Sets the value of the responseFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldInfo }
     *     
     */
    public void setResponseFields(ArrayOfFieldInfo value) {
        this.responseFields = value;
    }

}

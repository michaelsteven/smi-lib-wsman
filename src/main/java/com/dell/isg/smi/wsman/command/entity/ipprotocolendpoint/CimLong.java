/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.08 at 11:53:49 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity.ipprotocolendpoint;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for cimLong complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cimLong">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cimLong", propOrder = { "value" })
@XmlSeeAlso({ QualifierSInt64.class })
public class CimLong {

    @XmlValue
    protected long value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }


    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }


    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.27 at 11:23:03 AM IST 
//

package com.dell.isg.smi.wsman.command.entity.computersystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PowerState">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://schemas.dmtf.org/wbem/wscim/1/common>cimUnsignedInt">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Time" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimDateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "powerState", "time" })
@XmlRootElement(name = "SetPowerState_INPUT", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ComputerSystem")
public class SetPowerStateINPUT {

    @XmlElement(name = "PowerState", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ComputerSystem", required = true, nillable = true)
    protected SetPowerStateINPUT.PowerState powerState;
    @XmlElement(name = "Time", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ComputerSystem", required = true, nillable = true)
    protected CimDateTime time;


    /**
     * Gets the value of the powerState property.
     * 
     * @return possible object is {@link SetPowerStateINPUT.PowerState }
     * 
     */
    public SetPowerStateINPUT.PowerState getPowerState() {
        return powerState;
    }


    /**
     * Sets the value of the powerState property.
     * 
     * @param value allowed object is {@link SetPowerStateINPUT.PowerState }
     * 
     */
    public void setPowerState(SetPowerStateINPUT.PowerState value) {
        this.powerState = value;
    }


    /**
     * Gets the value of the time property.
     * 
     * @return possible object is {@link CimDateTime }
     * 
     */
    public CimDateTime getTime() {
        return time;
    }


    /**
     * Sets the value of the time property.
     * 
     * @param value allowed object is {@link CimDateTime }
     * 
     */
    public void setTime(CimDateTime value) {
        this.time = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://schemas.dmtf.org/wbem/wscim/1/common>cimUnsignedInt">
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PowerState extends CimUnsignedInt {

    }

}

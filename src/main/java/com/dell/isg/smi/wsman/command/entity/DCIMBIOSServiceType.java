/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.18 at 11:10:55 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for DCIM_BIOSService_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCIM_BIOSService_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}AvailableRequestedStates" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}Caption" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}CommunicationStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}CreationClassName"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}Description" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}DetailedStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}ElementName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}EnabledDefault" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}EnabledState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}Generation" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}HealthState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}InstallDate" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}InstanceID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}Name"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}OperatingStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}OperationalStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}OtherEnabledState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}PrimaryOwnerContact" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}PrimaryOwnerName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}PrimaryStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}RequestedState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}StartMode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}Started" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}Status" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}StatusDescriptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}SystemCreationClassName"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}SystemName"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}TimeOfLastStateChange" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/root/dcim/DCIM_BIOSService}TransitioningToState" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCIM_BIOSService_Type", propOrder = { "availableRequestedStates", "caption", "communicationStatus", "creationClassName", "description", "detailedStatus", "elementName", "enabledDefault", "enabledState", "generation", "healthState", "installDate", "instanceID", "name", "operatingStatus", "operationalStatus", "otherEnabledState", "primaryOwnerContact", "primaryOwnerName", "primaryStatus", "requestedState", "startMode", "started", "status", "statusDescriptions", "systemCreationClassName", "systemName", "timeOfLastStateChange", "transitioningToState", "any" })
public class DCIMBIOSServiceType {

    @XmlElement(name = "AvailableRequestedStates", nillable = true)
    protected List<AvailableRequestedStates> availableRequestedStates;
    @XmlElement(name = "Caption", nillable = true)
    protected Caption caption;
    @XmlElement(name = "CommunicationStatus", nillable = true)
    protected CommunicationStatus communicationStatus;
    @XmlElement(name = "CreationClassName", required = true)
    protected CreationClassName creationClassName;
    @XmlElement(name = "Description", nillable = true)
    protected CimString description;
    @XmlElement(name = "DetailedStatus", nillable = true)
    protected DetailedStatus detailedStatus;
    @XmlElement(name = "ElementName", nillable = true)
    protected CimString elementName;
    @XmlElement(name = "EnabledDefault", nillable = true)
    protected EnabledDefault enabledDefault;
    @XmlElement(name = "EnabledState", nillable = true)
    protected EnabledState enabledState;
    @XmlElement(name = "Generation", nillable = true)
    protected CimUnsignedLong generation;
    @XmlElement(name = "HealthState", nillable = true)
    protected HealthState healthState;
    @XmlElement(name = "InstallDate", nillable = true)
    protected CimDateTime installDate;
    @XmlElement(name = "InstanceID", nillable = true)
    protected CimString instanceID;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "OperatingStatus", nillable = true)
    protected OperatingStatus operatingStatus;
    @XmlElement(name = "OperationalStatus", nillable = true)
    protected List<OperationalStatus> operationalStatus;
    @XmlElement(name = "OtherEnabledState", nillable = true)
    protected CimString otherEnabledState;
    @XmlElement(name = "PrimaryOwnerContact", nillable = true)
    protected PrimaryOwnerContact primaryOwnerContact;
    @XmlElement(name = "PrimaryOwnerName", nillable = true)
    protected PrimaryOwnerName primaryOwnerName;
    @XmlElement(name = "PrimaryStatus", nillable = true)
    protected PrimaryStatus primaryStatus;
    @XmlElement(name = "RequestedState", nillable = true)
    protected RequestedState requestedState;
    @XmlElement(name = "StartMode", nillable = true)
    protected StartMode startMode;
    @XmlElement(name = "Started", nillable = true)
    protected CimBoolean started;
    @XmlElement(name = "Status", nillable = true)
    protected Status status;
    @XmlElement(name = "StatusDescriptions", nillable = true)
    protected List<CimString> statusDescriptions;
    @XmlElement(name = "SystemCreationClassName", required = true)
    protected SystemCreationClassName systemCreationClassName;
    @XmlElement(name = "SystemName", required = true)
    protected SystemName systemName;
    @XmlElement(name = "TimeOfLastStateChange", nillable = true)
    protected CimDateTime timeOfLastStateChange;
    @XmlElement(name = "TransitioningToState", nillable = true)
    protected TransitioningToState transitioningToState;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    /**
     * Gets the value of the availableRequestedStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableRequestedStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAvailableRequestedStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AvailableRequestedStates }
     * 
     * 
     */
    public List<AvailableRequestedStates> getAvailableRequestedStates() {
        if (availableRequestedStates == null) {
            availableRequestedStates = new ArrayList<AvailableRequestedStates>();
        }
        return this.availableRequestedStates;
    }


    /**
     * Gets the value of the caption property.
     * 
     * @return possible object is {@link Caption }
     * 
     */
    public Caption getCaption() {
        return caption;
    }


    /**
     * Sets the value of the caption property.
     * 
     * @param value allowed object is {@link Caption }
     * 
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }


    /**
     * Gets the value of the communicationStatus property.
     * 
     * @return possible object is {@link CommunicationStatus }
     * 
     */
    public CommunicationStatus getCommunicationStatus() {
        return communicationStatus;
    }


    /**
     * Sets the value of the communicationStatus property.
     * 
     * @param value allowed object is {@link CommunicationStatus }
     * 
     */
    public void setCommunicationStatus(CommunicationStatus value) {
        this.communicationStatus = value;
    }


    /**
     * Gets the value of the creationClassName property.
     * 
     * @return possible object is {@link CreationClassName }
     * 
     */
    public CreationClassName getCreationClassName() {
        return creationClassName;
    }


    /**
     * Sets the value of the creationClassName property.
     * 
     * @param value allowed object is {@link CreationClassName }
     * 
     */
    public void setCreationClassName(CreationClassName value) {
        this.creationClassName = value;
    }


    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getDescription() {
        return description;
    }


    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setDescription(CimString value) {
        this.description = value;
    }


    /**
     * Gets the value of the detailedStatus property.
     * 
     * @return possible object is {@link DetailedStatus }
     * 
     */
    public DetailedStatus getDetailedStatus() {
        return detailedStatus;
    }


    /**
     * Sets the value of the detailedStatus property.
     * 
     * @param value allowed object is {@link DetailedStatus }
     * 
     */
    public void setDetailedStatus(DetailedStatus value) {
        this.detailedStatus = value;
    }


    /**
     * Gets the value of the elementName property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getElementName() {
        return elementName;
    }


    /**
     * Sets the value of the elementName property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setElementName(CimString value) {
        this.elementName = value;
    }


    /**
     * Gets the value of the enabledDefault property.
     * 
     * @return possible object is {@link EnabledDefault }
     * 
     */
    public EnabledDefault getEnabledDefault() {
        return enabledDefault;
    }


    /**
     * Sets the value of the enabledDefault property.
     * 
     * @param value allowed object is {@link EnabledDefault }
     * 
     */
    public void setEnabledDefault(EnabledDefault value) {
        this.enabledDefault = value;
    }


    /**
     * Gets the value of the enabledState property.
     * 
     * @return possible object is {@link EnabledState }
     * 
     */
    public EnabledState getEnabledState() {
        return enabledState;
    }


    /**
     * Sets the value of the enabledState property.
     * 
     * @param value allowed object is {@link EnabledState }
     * 
     */
    public void setEnabledState(EnabledState value) {
        this.enabledState = value;
    }


    /**
     * Gets the value of the generation property.
     * 
     * @return possible object is {@link CimUnsignedLong }
     * 
     */
    public CimUnsignedLong getGeneration() {
        return generation;
    }


    /**
     * Sets the value of the generation property.
     * 
     * @param value allowed object is {@link CimUnsignedLong }
     * 
     */
    public void setGeneration(CimUnsignedLong value) {
        this.generation = value;
    }


    /**
     * Gets the value of the healthState property.
     * 
     * @return possible object is {@link HealthState }
     * 
     */
    public HealthState getHealthState() {
        return healthState;
    }


    /**
     * Sets the value of the healthState property.
     * 
     * @param value allowed object is {@link HealthState }
     * 
     */
    public void setHealthState(HealthState value) {
        this.healthState = value;
    }


    /**
     * Gets the value of the installDate property.
     * 
     * @return possible object is {@link CimDateTime }
     * 
     */
    public CimDateTime getInstallDate() {
        return installDate;
    }


    /**
     * Sets the value of the installDate property.
     * 
     * @param value allowed object is {@link CimDateTime }
     * 
     */
    public void setInstallDate(CimDateTime value) {
        this.installDate = value;
    }


    /**
     * Gets the value of the instanceID property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getInstanceID() {
        return instanceID;
    }


    /**
     * Sets the value of the instanceID property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setInstanceID(CimString value) {
        this.instanceID = value;
    }


    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link Name }
     * 
     */
    public Name getName() {
        return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link Name }
     * 
     */
    public void setName(Name value) {
        this.name = value;
    }


    /**
     * Gets the value of the operatingStatus property.
     * 
     * @return possible object is {@link OperatingStatus }
     * 
     */
    public OperatingStatus getOperatingStatus() {
        return operatingStatus;
    }


    /**
     * Sets the value of the operatingStatus property.
     * 
     * @param value allowed object is {@link OperatingStatus }
     * 
     */
    public void setOperatingStatus(OperatingStatus value) {
        this.operatingStatus = value;
    }


    /**
     * Gets the value of the operationalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOperationalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link OperationalStatus }
     * 
     * 
     */
    public List<OperationalStatus> getOperationalStatus() {
        if (operationalStatus == null) {
            operationalStatus = new ArrayList<OperationalStatus>();
        }
        return this.operationalStatus;
    }


    /**
     * Gets the value of the otherEnabledState property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getOtherEnabledState() {
        return otherEnabledState;
    }


    /**
     * Sets the value of the otherEnabledState property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setOtherEnabledState(CimString value) {
        this.otherEnabledState = value;
    }


    /**
     * Gets the value of the primaryOwnerContact property.
     * 
     * @return possible object is {@link PrimaryOwnerContact }
     * 
     */
    public PrimaryOwnerContact getPrimaryOwnerContact() {
        return primaryOwnerContact;
    }


    /**
     * Sets the value of the primaryOwnerContact property.
     * 
     * @param value allowed object is {@link PrimaryOwnerContact }
     * 
     */
    public void setPrimaryOwnerContact(PrimaryOwnerContact value) {
        this.primaryOwnerContact = value;
    }


    /**
     * Gets the value of the primaryOwnerName property.
     * 
     * @return possible object is {@link PrimaryOwnerName }
     * 
     */
    public PrimaryOwnerName getPrimaryOwnerName() {
        return primaryOwnerName;
    }


    /**
     * Sets the value of the primaryOwnerName property.
     * 
     * @param value allowed object is {@link PrimaryOwnerName }
     * 
     */
    public void setPrimaryOwnerName(PrimaryOwnerName value) {
        this.primaryOwnerName = value;
    }


    /**
     * Gets the value of the primaryStatus property.
     * 
     * @return possible object is {@link PrimaryStatus }
     * 
     */
    public PrimaryStatus getPrimaryStatus() {
        return primaryStatus;
    }


    /**
     * Sets the value of the primaryStatus property.
     * 
     * @param value allowed object is {@link PrimaryStatus }
     * 
     */
    public void setPrimaryStatus(PrimaryStatus value) {
        this.primaryStatus = value;
    }


    /**
     * Gets the value of the requestedState property.
     * 
     * @return possible object is {@link RequestedState }
     * 
     */
    public RequestedState getRequestedState() {
        return requestedState;
    }


    /**
     * Sets the value of the requestedState property.
     * 
     * @param value allowed object is {@link RequestedState }
     * 
     */
    public void setRequestedState(RequestedState value) {
        this.requestedState = value;
    }


    /**
     * Gets the value of the startMode property.
     * 
     * @return possible object is {@link StartMode }
     * 
     */
    public StartMode getStartMode() {
        return startMode;
    }


    /**
     * Sets the value of the startMode property.
     * 
     * @param value allowed object is {@link StartMode }
     * 
     */
    public void setStartMode(StartMode value) {
        this.startMode = value;
    }


    /**
     * Gets the value of the started property.
     * 
     * @return possible object is {@link CimBoolean }
     * 
     */
    public CimBoolean getStarted() {
        return started;
    }


    /**
     * Sets the value of the started property.
     * 
     * @param value allowed object is {@link CimBoolean }
     * 
     */
    public void setStarted(CimBoolean value) {
        this.started = value;
    }


    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link Status }
     * 
     */
    public Status getStatus() {
        return status;
    }


    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link Status }
     * 
     */
    public void setStatus(Status value) {
        this.status = value;
    }


    /**
     * Gets the value of the statusDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getStatusDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CimString }
     * 
     * 
     */
    public List<CimString> getStatusDescriptions() {
        if (statusDescriptions == null) {
            statusDescriptions = new ArrayList<CimString>();
        }
        return this.statusDescriptions;
    }


    /**
     * Gets the value of the systemCreationClassName property.
     * 
     * @return possible object is {@link SystemCreationClassName }
     * 
     */
    public SystemCreationClassName getSystemCreationClassName() {
        return systemCreationClassName;
    }


    /**
     * Sets the value of the systemCreationClassName property.
     * 
     * @param value allowed object is {@link SystemCreationClassName }
     * 
     */
    public void setSystemCreationClassName(SystemCreationClassName value) {
        this.systemCreationClassName = value;
    }


    /**
     * Gets the value of the systemName property.
     * 
     * @return possible object is {@link SystemName }
     * 
     */
    public SystemName getSystemName() {
        return systemName;
    }


    /**
     * Sets the value of the systemName property.
     * 
     * @param value allowed object is {@link SystemName }
     * 
     */
    public void setSystemName(SystemName value) {
        this.systemName = value;
    }


    /**
     * Gets the value of the timeOfLastStateChange property.
     * 
     * @return possible object is {@link CimDateTime }
     * 
     */
    public CimDateTime getTimeOfLastStateChange() {
        return timeOfLastStateChange;
    }


    /**
     * Sets the value of the timeOfLastStateChange property.
     * 
     * @param value allowed object is {@link CimDateTime }
     * 
     */
    public void setTimeOfLastStateChange(CimDateTime value) {
        this.timeOfLastStateChange = value;
    }


    /**
     * Gets the value of the transitioningToState property.
     * 
     * @return possible object is {@link TransitioningToState }
     * 
     */
    public TransitioningToState getTransitioningToState() {
        return transitioningToState;
    }


    /**
     * Sets the value of the transitioningToState property.
     * 
     * @param value allowed object is {@link TransitioningToState }
     * 
     */
    public void setTransitioningToState(TransitioningToState value) {
        this.transitioningToState = value;
    }


    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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


package com.google.api.ads.adwords.jaxws.v201607.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a price extension.
 *           
 * 
 * <p>Java class for PriceFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="priceExtensionType" type="{https://adwords.google.com/api/adwords/cm/v201607}PriceExtensionType" minOccurs="0"/>
 *         &lt;element name="priceQualifier" type="{https://adwords.google.com/api/adwords/cm/v201607}PriceExtensionPriceQualifier" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableRows" type="{https://adwords.google.com/api/adwords/cm/v201607}PriceTableRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFeedItem", propOrder = {
    "priceExtensionType",
    "priceQualifier",
    "trackingUrlTemplate",
    "language",
    "tableRows"
})
public class PriceFeedItem
    extends ExtensionFeedItem
{

    @XmlSchemaType(name = "string")
    protected PriceExtensionType priceExtensionType;
    @XmlSchemaType(name = "string")
    protected PriceExtensionPriceQualifier priceQualifier;
    protected String trackingUrlTemplate;
    protected String language;
    protected List<PriceTableRow> tableRows;

    /**
     * Gets the value of the priceExtensionType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtensionType }
     *     
     */
    public PriceExtensionType getPriceExtensionType() {
        return priceExtensionType;
    }

    /**
     * Sets the value of the priceExtensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtensionType }
     *     
     */
    public void setPriceExtensionType(PriceExtensionType value) {
        this.priceExtensionType = value;
    }

    /**
     * Gets the value of the priceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtensionPriceQualifier }
     *     
     */
    public PriceExtensionPriceQualifier getPriceQualifier() {
        return priceQualifier;
    }

    /**
     * Sets the value of the priceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtensionPriceQualifier }
     *     
     */
    public void setPriceQualifier(PriceExtensionPriceQualifier value) {
        this.priceQualifier = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the tableRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceTableRow }
     * 
     * 
     */
    public List<PriceTableRow> getTableRows() {
        if (tableRows == null) {
            tableRows = new ArrayList<PriceTableRow>();
        }
        return this.tableRows;
    }

}

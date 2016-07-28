/**
 * PolicyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * Approval and policy information attached to an entity.
 */
public class PolicyData  implements java.io.Serializable {
    /* List of disapproval reasons attached to the entity. */
    private com.google.api.ads.adwords.axis.v201607.cm.DisapprovalReason[] disapprovalReasons;

    /* Indicates that this instance is a subtype of PolicyData.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String policyDataType;

    public PolicyData() {
    }

    public PolicyData(
           com.google.api.ads.adwords.axis.v201607.cm.DisapprovalReason[] disapprovalReasons,
           java.lang.String policyDataType) {
           this.disapprovalReasons = disapprovalReasons;
           this.policyDataType = policyDataType;
    }


    /**
     * Gets the disapprovalReasons value for this PolicyData.
     * 
     * @return disapprovalReasons   * List of disapproval reasons attached to the entity.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.DisapprovalReason[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this PolicyData.
     * 
     * @param disapprovalReasons   * List of disapproval reasons attached to the entity.
     */
    public void setDisapprovalReasons(com.google.api.ads.adwords.axis.v201607.cm.DisapprovalReason[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public com.google.api.ads.adwords.axis.v201607.cm.DisapprovalReason getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, com.google.api.ads.adwords.axis.v201607.cm.DisapprovalReason _value) {
        this.disapprovalReasons[i] = _value;
    }


    /**
     * Gets the policyDataType value for this PolicyData.
     * 
     * @return policyDataType   * Indicates that this instance is a subtype of PolicyData.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getPolicyDataType() {
        return policyDataType;
    }


    /**
     * Sets the policyDataType value for this PolicyData.
     * 
     * @param policyDataType   * Indicates that this instance is a subtype of PolicyData.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setPolicyDataType(java.lang.String policyDataType) {
        this.policyDataType = policyDataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyData)) return false;
        PolicyData other = (PolicyData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons()))) &&
            ((this.policyDataType==null && other.getPolicyDataType()==null) || 
             (this.policyDataType!=null &&
              this.policyDataType.equals(other.getPolicyDataType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisapprovalReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyDataType() != null) {
            _hashCode += getPolicyDataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "PolicyData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "DisapprovalReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "PolicyData.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

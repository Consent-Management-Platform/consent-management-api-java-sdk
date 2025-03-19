/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/CreateServiceUserConsentRequestContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceUserConsentRequestContent implements Serializable, Cloneable, StructuredPojo {

    private java.util.Map<String, String> consentData;

    private String consentType;

    private java.util.Date expiryTime;

    private String status;

    /**
     * @return
     */

    public java.util.Map<String, String> getConsentData() {
        return consentData;
    }

    /**
     * @param consentData
     */

    public void setConsentData(java.util.Map<String, String> consentData) {
        this.consentData = consentData;
    }

    /**
     * @param consentData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentRequestContent consentData(java.util.Map<String, String> consentData) {
        setConsentData(consentData);
        return this;
    }

    /**
     * Add a single ConsentData entry
     *
     * @see CreateServiceUserConsentRequestContent#consentData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentRequestContent addConsentDataEntry(String key, String value) {
        if (null == this.consentData) {
            this.consentData = new java.util.HashMap<String, String>();
        }
        if (this.consentData.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.consentData.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConsentData.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentRequestContent clearConsentDataEntries() {
        this.consentData = null;
        return this;
    }

    /**
     * @param consentType
     */

    public void setConsentType(String consentType) {
        this.consentType = consentType;
    }

    /**
     * @return
     */

    public String getConsentType() {
        return this.consentType;
    }

    /**
     * @param consentType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentRequestContent consentType(String consentType) {
        setConsentType(consentType);
        return this;
    }

    /**
     * @param expiryTime
     */

    public void setExpiryTime(java.util.Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * @return
     */

    public java.util.Date getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * @param expiryTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentRequestContent expiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * @param status
     * @see ConsentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see ConsentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsentStatus
     */

    public CreateServiceUserConsentRequestContent status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @see ConsentStatus
     */

    public void setStatus(ConsentStatus status) {
        status(status);
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsentStatus
     */

    public CreateServiceUserConsentRequestContent status(ConsentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConsentData() != null)
            sb.append("ConsentData: ").append(getConsentData()).append(",");
        if (getConsentType() != null)
            sb.append("ConsentType: ").append(getConsentType()).append(",");
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceUserConsentRequestContent == false)
            return false;
        CreateServiceUserConsentRequestContent other = (CreateServiceUserConsentRequestContent) obj;
        if (other.getConsentData() == null ^ this.getConsentData() == null)
            return false;
        if (other.getConsentData() != null && other.getConsentData().equals(this.getConsentData()) == false)
            return false;
        if (other.getConsentType() == null ^ this.getConsentType() == null)
            return false;
        if (other.getConsentType() != null && other.getConsentType().equals(this.getConsentType()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsentData() == null) ? 0 : getConsentData().hashCode());
        hashCode = prime * hashCode + ((getConsentType() == null) ? 0 : getConsentType().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceUserConsentRequestContent clone() {
        try {
            return (CreateServiceUserConsentRequestContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.consentframework.consentmanagement.sdk.model.transform.CreateServiceUserConsentRequestContentMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

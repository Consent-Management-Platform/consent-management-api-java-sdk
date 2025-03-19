/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/Consent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Consent implements Serializable, Cloneable, StructuredPojo {

    private java.util.Map<String, String> consentData;

    private String consentId;

    private String consentType;

    private Integer consentVersion;

    private java.util.Date expiryTime;

    private String serviceId;

    private String status;

    private String userId;

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

    public Consent consentData(java.util.Map<String, String> consentData) {
        setConsentData(consentData);
        return this;
    }

    /**
     * Add a single ConsentData entry
     *
     * @see Consent#consentData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Consent addConsentDataEntry(String key, String value) {
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

    public Consent clearConsentDataEntries() {
        this.consentData = null;
        return this;
    }

    /**
     * @param consentId
     */

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    /**
     * @return
     */

    public String getConsentId() {
        return this.consentId;
    }

    /**
     * @param consentId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consent consentId(String consentId) {
        setConsentId(consentId);
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

    public Consent consentType(String consentType) {
        setConsentType(consentType);
        return this;
    }

    /**
     * @param consentVersion
     */

    public void setConsentVersion(Integer consentVersion) {
        this.consentVersion = consentVersion;
    }

    /**
     * @return
     */

    public Integer getConsentVersion() {
        return this.consentVersion;
    }

    /**
     * @param consentVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consent consentVersion(Integer consentVersion) {
        setConsentVersion(consentVersion);
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

    public Consent expiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * @param serviceId
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @param serviceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consent serviceId(String serviceId) {
        setServiceId(serviceId);
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

    public Consent status(String status) {
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

    public Consent status(ConsentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param userId
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consent userId(String userId) {
        setUserId(userId);
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
        if (getConsentId() != null)
            sb.append("ConsentId: ").append(getConsentId()).append(",");
        if (getConsentType() != null)
            sb.append("ConsentType: ").append(getConsentType()).append(",");
        if (getConsentVersion() != null)
            sb.append("ConsentVersion: ").append(getConsentVersion()).append(",");
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Consent == false)
            return false;
        Consent other = (Consent) obj;
        if (other.getConsentData() == null ^ this.getConsentData() == null)
            return false;
        if (other.getConsentData() != null && other.getConsentData().equals(this.getConsentData()) == false)
            return false;
        if (other.getConsentId() == null ^ this.getConsentId() == null)
            return false;
        if (other.getConsentId() != null && other.getConsentId().equals(this.getConsentId()) == false)
            return false;
        if (other.getConsentType() == null ^ this.getConsentType() == null)
            return false;
        if (other.getConsentType() != null && other.getConsentType().equals(this.getConsentType()) == false)
            return false;
        if (other.getConsentVersion() == null ^ this.getConsentVersion() == null)
            return false;
        if (other.getConsentVersion() != null && other.getConsentVersion().equals(this.getConsentVersion()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsentData() == null) ? 0 : getConsentData().hashCode());
        hashCode = prime * hashCode + ((getConsentId() == null) ? 0 : getConsentId().hashCode());
        hashCode = prime * hashCode + ((getConsentType() == null) ? 0 : getConsentType().hashCode());
        hashCode = prime * hashCode + ((getConsentVersion() == null) ? 0 : getConsentVersion().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public Consent clone() {
        try {
            return (Consent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.consentframework.consentmanagement.sdk.model.transform.ConsentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/GetServiceUserConsent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceUserConsentRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String consentId;

    private String serviceId;

    private String userId;

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

    public GetServiceUserConsentRequest consentId(String consentId) {
        setConsentId(consentId);
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

    public GetServiceUserConsentRequest serviceId(String serviceId) {
        setServiceId(serviceId);
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

    public GetServiceUserConsentRequest userId(String userId) {
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
        if (getConsentId() != null)
            sb.append("ConsentId: ").append(getConsentId()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
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

        if (obj instanceof GetServiceUserConsentRequest == false)
            return false;
        GetServiceUserConsentRequest other = (GetServiceUserConsentRequest) obj;
        if (other.getConsentId() == null ^ this.getConsentId() == null)
            return false;
        if (other.getConsentId() != null && other.getConsentId().equals(this.getConsentId()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
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

        hashCode = prime * hashCode + ((getConsentId() == null) ? 0 : getConsentId().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceUserConsentRequest clone() {
        return (GetServiceUserConsentRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetServiceUserConsentRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

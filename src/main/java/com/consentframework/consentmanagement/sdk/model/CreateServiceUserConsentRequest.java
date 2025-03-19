/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/CreateServiceUserConsent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceUserConsentRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private CreateServiceUserConsentRequestContent createServiceUserConsentRequestContent;

    private String serviceId;

    private String userId;

    /**
     * @param createServiceUserConsentRequestContent
     */

    public void setCreateServiceUserConsentRequestContent(CreateServiceUserConsentRequestContent createServiceUserConsentRequestContent) {
        this.createServiceUserConsentRequestContent = createServiceUserConsentRequestContent;
    }

    /**
     * @return
     */

    public CreateServiceUserConsentRequestContent getCreateServiceUserConsentRequestContent() {
        return this.createServiceUserConsentRequestContent;
    }

    /**
     * @param createServiceUserConsentRequestContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentRequest createServiceUserConsentRequestContent(CreateServiceUserConsentRequestContent createServiceUserConsentRequestContent) {
        setCreateServiceUserConsentRequestContent(createServiceUserConsentRequestContent);
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

    public CreateServiceUserConsentRequest serviceId(String serviceId) {
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

    public CreateServiceUserConsentRequest userId(String userId) {
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
        if (getCreateServiceUserConsentRequestContent() != null)
            sb.append("CreateServiceUserConsentRequestContent: ").append(getCreateServiceUserConsentRequestContent()).append(",");
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

        if (obj instanceof CreateServiceUserConsentRequest == false)
            return false;
        CreateServiceUserConsentRequest other = (CreateServiceUserConsentRequest) obj;
        if (other.getCreateServiceUserConsentRequestContent() == null ^ this.getCreateServiceUserConsentRequestContent() == null)
            return false;
        if (other.getCreateServiceUserConsentRequestContent() != null
                && other.getCreateServiceUserConsentRequestContent().equals(this.getCreateServiceUserConsentRequestContent()) == false)
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

        hashCode = prime * hashCode + ((getCreateServiceUserConsentRequestContent() == null) ? 0 : getCreateServiceUserConsentRequestContent().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceUserConsentRequest clone() {
        return (CreateServiceUserConsentRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public CreateServiceUserConsentRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

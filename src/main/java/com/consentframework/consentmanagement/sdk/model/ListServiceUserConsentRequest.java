/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/ListServiceUserConsent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceUserConsentRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String limit;

    private String pageToken;

    private String serviceId;

    private String userId;

    /**
     * @param limit
     */

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public String getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceUserConsentRequest limit(String limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param pageToken
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * @return
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @param pageToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceUserConsentRequest pageToken(String pageToken) {
        setPageToken(pageToken);
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

    public ListServiceUserConsentRequest serviceId(String serviceId) {
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

    public ListServiceUserConsentRequest userId(String userId) {
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
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

        if (obj instanceof ListServiceUserConsentRequest == false)
            return false;
        ListServiceUserConsentRequest other = (ListServiceUserConsentRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
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

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceUserConsentRequest clone() {
        return (ListServiceUserConsentRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public ListServiceUserConsentRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

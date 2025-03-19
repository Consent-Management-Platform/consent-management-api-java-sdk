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
public class GetServiceUserConsentResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private GetServiceUserConsentResponseContent getServiceUserConsentResponseContent;

    /**
     * @param getServiceUserConsentResponseContent
     */

    public void setGetServiceUserConsentResponseContent(GetServiceUserConsentResponseContent getServiceUserConsentResponseContent) {
        this.getServiceUserConsentResponseContent = getServiceUserConsentResponseContent;
    }

    /**
     * @return
     */

    public GetServiceUserConsentResponseContent getGetServiceUserConsentResponseContent() {
        return this.getServiceUserConsentResponseContent;
    }

    /**
     * @param getServiceUserConsentResponseContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceUserConsentResult getServiceUserConsentResponseContent(GetServiceUserConsentResponseContent getServiceUserConsentResponseContent) {
        setGetServiceUserConsentResponseContent(getServiceUserConsentResponseContent);
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
        if (getGetServiceUserConsentResponseContent() != null)
            sb.append("GetServiceUserConsentResponseContent: ").append(getGetServiceUserConsentResponseContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceUserConsentResult == false)
            return false;
        GetServiceUserConsentResult other = (GetServiceUserConsentResult) obj;
        if (other.getGetServiceUserConsentResponseContent() == null ^ this.getGetServiceUserConsentResponseContent() == null)
            return false;
        if (other.getGetServiceUserConsentResponseContent() != null
                && other.getGetServiceUserConsentResponseContent().equals(this.getGetServiceUserConsentResponseContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGetServiceUserConsentResponseContent() == null) ? 0 : getGetServiceUserConsentResponseContent().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceUserConsentResult clone() {
        try {
            return (GetServiceUserConsentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

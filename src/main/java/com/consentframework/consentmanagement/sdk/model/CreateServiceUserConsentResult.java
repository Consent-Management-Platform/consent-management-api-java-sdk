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
public class CreateServiceUserConsentResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private CreateServiceUserConsentResponseContent createServiceUserConsentResponseContent;

    /**
     * @param createServiceUserConsentResponseContent
     */

    public void setCreateServiceUserConsentResponseContent(CreateServiceUserConsentResponseContent createServiceUserConsentResponseContent) {
        this.createServiceUserConsentResponseContent = createServiceUserConsentResponseContent;
    }

    /**
     * @return
     */

    public CreateServiceUserConsentResponseContent getCreateServiceUserConsentResponseContent() {
        return this.createServiceUserConsentResponseContent;
    }

    /**
     * @param createServiceUserConsentResponseContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceUserConsentResult createServiceUserConsentResponseContent(
            CreateServiceUserConsentResponseContent createServiceUserConsentResponseContent) {
        setCreateServiceUserConsentResponseContent(createServiceUserConsentResponseContent);
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
        if (getCreateServiceUserConsentResponseContent() != null)
            sb.append("CreateServiceUserConsentResponseContent: ").append(getCreateServiceUserConsentResponseContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceUserConsentResult == false)
            return false;
        CreateServiceUserConsentResult other = (CreateServiceUserConsentResult) obj;
        if (other.getCreateServiceUserConsentResponseContent() == null ^ this.getCreateServiceUserConsentResponseContent() == null)
            return false;
        if (other.getCreateServiceUserConsentResponseContent() != null
                && other.getCreateServiceUserConsentResponseContent().equals(this.getCreateServiceUserConsentResponseContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateServiceUserConsentResponseContent() == null) ? 0 : getCreateServiceUserConsentResponseContent().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceUserConsentResult clone() {
        try {
            return (CreateServiceUserConsentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

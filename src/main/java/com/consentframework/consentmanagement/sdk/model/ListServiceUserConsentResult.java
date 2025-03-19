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
public class ListServiceUserConsentResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private ListServiceUserConsentResponseContent listServiceUserConsentResponseContent;

    /**
     * @param listServiceUserConsentResponseContent
     */

    public void setListServiceUserConsentResponseContent(ListServiceUserConsentResponseContent listServiceUserConsentResponseContent) {
        this.listServiceUserConsentResponseContent = listServiceUserConsentResponseContent;
    }

    /**
     * @return
     */

    public ListServiceUserConsentResponseContent getListServiceUserConsentResponseContent() {
        return this.listServiceUserConsentResponseContent;
    }

    /**
     * @param listServiceUserConsentResponseContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceUserConsentResult listServiceUserConsentResponseContent(ListServiceUserConsentResponseContent listServiceUserConsentResponseContent) {
        setListServiceUserConsentResponseContent(listServiceUserConsentResponseContent);
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
        if (getListServiceUserConsentResponseContent() != null)
            sb.append("ListServiceUserConsentResponseContent: ").append(getListServiceUserConsentResponseContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceUserConsentResult == false)
            return false;
        ListServiceUserConsentResult other = (ListServiceUserConsentResult) obj;
        if (other.getListServiceUserConsentResponseContent() == null ^ this.getListServiceUserConsentResponseContent() == null)
            return false;
        if (other.getListServiceUserConsentResponseContent() != null
                && other.getListServiceUserConsentResponseContent().equals(this.getListServiceUserConsentResponseContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListServiceUserConsentResponseContent() == null) ? 0 : getListServiceUserConsentResponseContent().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceUserConsentResult clone() {
        try {
            return (ListServiceUserConsentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

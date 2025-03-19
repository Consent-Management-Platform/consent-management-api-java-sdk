/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/CreateServiceUserConsentResponseContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceUserConsentResponseContent implements Serializable, Cloneable, StructuredPojo {

    private String consentId;

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

    public CreateServiceUserConsentResponseContent consentId(String consentId) {
        setConsentId(consentId);
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
            sb.append("ConsentId: ").append(getConsentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceUserConsentResponseContent == false)
            return false;
        CreateServiceUserConsentResponseContent other = (CreateServiceUserConsentResponseContent) obj;
        if (other.getConsentId() == null ^ this.getConsentId() == null)
            return false;
        if (other.getConsentId() != null && other.getConsentId().equals(this.getConsentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsentId() == null) ? 0 : getConsentId().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceUserConsentResponseContent clone() {
        try {
            return (CreateServiceUserConsentResponseContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.consentframework.consentmanagement.sdk.model.transform.CreateServiceUserConsentResponseContentMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

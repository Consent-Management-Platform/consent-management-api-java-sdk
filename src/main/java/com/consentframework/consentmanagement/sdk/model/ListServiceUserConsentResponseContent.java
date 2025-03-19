/**

*/
package com.consentframework.consentmanagement.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/ListServiceUserConsentResponseContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceUserConsentResponseContent implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Consent> data;

    private String nextPageToken;

    /**
     * @return
     */

    public java.util.List<Consent> getData() {
        return data;
    }

    /**
     * @param data
     */

    public void setData(java.util.Collection<Consent> data) {
        if (data == null) {
            this.data = null;
            return;
        }

        this.data = new java.util.ArrayList<Consent>(data);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setData(java.util.Collection)} or {@link #withData(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param data
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceUserConsentResponseContent data(Consent... data) {
        if (this.data == null) {
            setData(new java.util.ArrayList<Consent>(data.length));
        }
        for (Consent ele : data) {
            this.data.add(ele);
        }
        return this;
    }

    /**
     * @param data
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceUserConsentResponseContent data(java.util.Collection<Consent> data) {
        setData(data);
        return this;
    }

    /**
     * @param nextPageToken
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * @return
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @param nextPageToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceUserConsentResponseContent nextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceUserConsentResponseContent == false)
            return false;
        ListServiceUserConsentResponseContent other = (ListServiceUserConsentResponseContent) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceUserConsentResponseContent clone() {
        try {
            return (ListServiceUserConsentResponseContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.consentframework.consentmanagement.sdk.model.transform.ListServiceUserConsentResponseContentMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

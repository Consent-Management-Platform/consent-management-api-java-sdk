/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetServiceUserConsentResponseContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetServiceUserConsentResponseContentMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("data").build();

    private static final GetServiceUserConsentResponseContentMarshaller instance = new GetServiceUserConsentResponseContentMarshaller();

    public static GetServiceUserConsentResponseContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetServiceUserConsentResponseContent getServiceUserConsentResponseContent, ProtocolMarshaller protocolMarshaller) {

        if (getServiceUserConsentResponseContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getServiceUserConsentResponseContent.getData(), DATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

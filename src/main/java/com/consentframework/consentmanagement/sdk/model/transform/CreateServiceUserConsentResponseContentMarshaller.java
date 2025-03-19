/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateServiceUserConsentResponseContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateServiceUserConsentResponseContentMarshaller {

    private static final MarshallingInfo<String> CONSENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("consentId").build();

    private static final CreateServiceUserConsentResponseContentMarshaller instance = new CreateServiceUserConsentResponseContentMarshaller();

    public static CreateServiceUserConsentResponseContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateServiceUserConsentResponseContent createServiceUserConsentResponseContent, ProtocolMarshaller protocolMarshaller) {

        if (createServiceUserConsentResponseContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createServiceUserConsentResponseContent.getConsentId(), CONSENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

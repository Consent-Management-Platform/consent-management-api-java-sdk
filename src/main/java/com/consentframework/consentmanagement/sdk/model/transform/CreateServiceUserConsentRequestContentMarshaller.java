/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateServiceUserConsentRequestContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateServiceUserConsentRequestContentMarshaller {

    private static final MarshallingInfo<Map> CONSENTDATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("consentData").build();
    private static final MarshallingInfo<String> CONSENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consentType").build();
    private static final MarshallingInfo<java.util.Date> EXPIRYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiryTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final CreateServiceUserConsentRequestContentMarshaller instance = new CreateServiceUserConsentRequestContentMarshaller();

    public static CreateServiceUserConsentRequestContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateServiceUserConsentRequestContent createServiceUserConsentRequestContent, ProtocolMarshaller protocolMarshaller) {

        if (createServiceUserConsentRequestContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createServiceUserConsentRequestContent.getConsentData(), CONSENTDATA_BINDING);
            protocolMarshaller.marshall(createServiceUserConsentRequestContent.getConsentType(), CONSENTTYPE_BINDING);
            protocolMarshaller.marshall(createServiceUserConsentRequestContent.getExpiryTime(), EXPIRYTIME_BINDING);
            protocolMarshaller.marshall(createServiceUserConsentRequestContent.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

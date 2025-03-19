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
 * UpdateServiceUserConsentRequestContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateServiceUserConsentRequestContentMarshaller {

    private static final MarshallingInfo<Map> CONSENTDATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("consentData").build();
    private static final MarshallingInfo<String> CONSENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consentType").build();
    private static final MarshallingInfo<Integer> CONSENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consentVersion").build();
    private static final MarshallingInfo<java.util.Date> EXPIRYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiryTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final UpdateServiceUserConsentRequestContentMarshaller instance = new UpdateServiceUserConsentRequestContentMarshaller();

    public static UpdateServiceUserConsentRequestContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateServiceUserConsentRequestContent updateServiceUserConsentRequestContent, ProtocolMarshaller protocolMarshaller) {

        if (updateServiceUserConsentRequestContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateServiceUserConsentRequestContent.getConsentData(), CONSENTDATA_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequestContent.getConsentType(), CONSENTTYPE_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequestContent.getConsentVersion(), CONSENTVERSION_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequestContent.getExpiryTime(), EXPIRYTIME_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequestContent.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

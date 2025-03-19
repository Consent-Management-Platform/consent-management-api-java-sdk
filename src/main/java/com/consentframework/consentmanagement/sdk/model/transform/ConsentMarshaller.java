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
 * ConsentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConsentMarshaller {

    private static final MarshallingInfo<Map> CONSENTDATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("consentData").build();
    private static final MarshallingInfo<String> CONSENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("consentId").build();
    private static final MarshallingInfo<String> CONSENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consentType").build();
    private static final MarshallingInfo<Integer> CONSENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consentVersion").build();
    private static final MarshallingInfo<java.util.Date> EXPIRYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiryTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("serviceId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();

    private static final ConsentMarshaller instance = new ConsentMarshaller();

    public static ConsentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Consent consent, ProtocolMarshaller protocolMarshaller) {

        if (consent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(consent.getConsentData(), CONSENTDATA_BINDING);
            protocolMarshaller.marshall(consent.getConsentId(), CONSENTID_BINDING);
            protocolMarshaller.marshall(consent.getConsentType(), CONSENTTYPE_BINDING);
            protocolMarshaller.marshall(consent.getConsentVersion(), CONSENTVERSION_BINDING);
            protocolMarshaller.marshall(consent.getExpiryTime(), EXPIRYTIME_BINDING);
            protocolMarshaller.marshall(consent.getServiceId(), SERVICEID_BINDING);
            protocolMarshaller.marshall(consent.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(consent.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

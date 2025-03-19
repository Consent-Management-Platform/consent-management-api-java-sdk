/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateServiceUserConsentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateServiceUserConsentRequestMarshaller {

    private static final MarshallingInfo<String> CONSENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("consentId").build();
    private static final MarshallingInfo<String> SERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("serviceId").build();
    private static final MarshallingInfo<StructuredPojo> UPDATESERVICEUSERCONSENTREQUESTCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("userId").build();

    private static final UpdateServiceUserConsentRequestMarshaller instance = new UpdateServiceUserConsentRequestMarshaller();

    public static UpdateServiceUserConsentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateServiceUserConsentRequest updateServiceUserConsentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateServiceUserConsentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateServiceUserConsentRequest.getConsentId(), CONSENTID_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequest.getServiceId(), SERVICEID_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequest.getUpdateServiceUserConsentRequestContent(),
                    UPDATESERVICEUSERCONSENTREQUESTCONTENT_BINDING);
            protocolMarshaller.marshall(updateServiceUserConsentRequest.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

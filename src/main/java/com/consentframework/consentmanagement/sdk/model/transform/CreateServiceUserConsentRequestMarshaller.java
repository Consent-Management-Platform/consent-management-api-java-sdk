/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateServiceUserConsentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateServiceUserConsentRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> CREATESERVICEUSERCONSENTREQUESTCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();
    private static final MarshallingInfo<String> SERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("serviceId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("userId").build();

    private static final CreateServiceUserConsentRequestMarshaller instance = new CreateServiceUserConsentRequestMarshaller();

    public static CreateServiceUserConsentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateServiceUserConsentRequest createServiceUserConsentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createServiceUserConsentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createServiceUserConsentRequest.getCreateServiceUserConsentRequestContent(),
                    CREATESERVICEUSERCONSENTREQUESTCONTENT_BINDING);
            protocolMarshaller.marshall(createServiceUserConsentRequest.getServiceId(), SERVICEID_BINDING);
            protocolMarshaller.marshall(createServiceUserConsentRequest.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListServiceUserConsentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListServiceUserConsentRequestMarshaller {

    private static final MarshallingInfo<String> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<String> PAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("pageToken").build();
    private static final MarshallingInfo<String> SERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("serviceId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("userId").build();

    private static final ListServiceUserConsentRequestMarshaller instance = new ListServiceUserConsentRequestMarshaller();

    public static ListServiceUserConsentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListServiceUserConsentRequest listServiceUserConsentRequest, ProtocolMarshaller protocolMarshaller) {

        if (listServiceUserConsentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listServiceUserConsentRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(listServiceUserConsentRequest.getPageToken(), PAGETOKEN_BINDING);
            protocolMarshaller.marshall(listServiceUserConsentRequest.getServiceId(), SERVICEID_BINDING);
            protocolMarshaller.marshall(listServiceUserConsentRequest.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

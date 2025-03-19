/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.consentframework.consentmanagement.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListServiceUserConsentResponseContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListServiceUserConsentResponseContentMarshaller {

    private static final MarshallingInfo<List> DATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("data").build();
    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextPageToken").build();

    private static final ListServiceUserConsentResponseContentMarshaller instance = new ListServiceUserConsentResponseContentMarshaller();

    public static ListServiceUserConsentResponseContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListServiceUserConsentResponseContent listServiceUserConsentResponseContent, ProtocolMarshaller protocolMarshaller) {

        if (listServiceUserConsentResponseContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listServiceUserConsentResponseContent.getData(), DATA_BINDING);
            protocolMarshaller.marshall(listServiceUserConsentResponseContent.getNextPageToken(), NEXTPAGETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

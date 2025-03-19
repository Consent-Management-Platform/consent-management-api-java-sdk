/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.consentframework.consentmanagement.sdk.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateServiceUserConsentRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateServiceUserConsentRequestProtocolMarshaller implements Marshaller<Request<UpdateServiceUserConsentRequest>, UpdateServiceUserConsentRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/dev/v1/consent-management/services/{serviceId}/users/{userId}/consents/{consentId}").httpMethodName(HttpMethodName.POST)
            .hasExplicitPayloadMember(true).hasPayloadMembers(true).serviceName("ConsentManagementApi").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public UpdateServiceUserConsentRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateServiceUserConsentRequest> marshall(UpdateServiceUserConsentRequest updateServiceUserConsentRequest) {

        if (updateServiceUserConsentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<UpdateServiceUserConsentRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, updateServiceUserConsentRequest);

            protocolMarshaller.startMarshalling();
            UpdateServiceUserConsentRequestMarshaller.getInstance().marshall(updateServiceUserConsentRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

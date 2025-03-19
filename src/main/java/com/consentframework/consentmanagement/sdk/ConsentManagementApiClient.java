/**

*/
package com.consentframework.consentmanagement.sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import com.consentframework.consentmanagement.sdk.model.*;
import com.consentframework.consentmanagement.sdk.model.transform.*;

/**
 * Client for accessing ConsentManagementApi. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ConsentManagementApiClient implements ConsentManagementApi {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.consentframework.consentmanagement.sdk.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.consentframework.consentmanagement.sdk.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.consentframework.consentmanagement.sdk.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.consentframework.consentmanagement.sdk.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.consentframework.consentmanagement.sdk.model.ConsentManagementApiException.class));

    /**
     * Constructs a new client to invoke service methods on ConsentManagementApi using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    ConsentManagementApiClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param createServiceUserConsentRequest
     * @return Result of the CreateServiceUserConsent operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ConflictException
     * @sample ConsentManagementApi.CreateServiceUserConsent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/CreateServiceUserConsent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceUserConsentResult createServiceUserConsent(CreateServiceUserConsentRequest createServiceUserConsentRequest) {
        HttpResponseHandler<CreateServiceUserConsentResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceUserConsentResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(BadRequestException.class).withHttpStatusCode(400), new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500),
                new JsonErrorShapeMetadata().withModeledClass(ConflictException.class).withHttpStatusCode(409));

        return clientHandler.execute(new ClientExecutionParams<CreateServiceUserConsentRequest, CreateServiceUserConsentResult>()
                .withMarshaller(new CreateServiceUserConsentRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(createServiceUserConsentRequest));
    }

    /**
     * @param getServiceUserConsentRequest
     * @return Result of the GetServiceUserConsent operation returned by the service.
     * @throws NotFoundException
     * @throws InternalServerErrorException
     * @sample ConsentManagementApi.GetServiceUserConsent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/GetServiceUserConsent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceUserConsentResult getServiceUserConsent(GetServiceUserConsentRequest getServiceUserConsentRequest) {
        HttpResponseHandler<GetServiceUserConsentResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceUserConsentResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(NotFoundException.class).withHttpStatusCode(404),
                new JsonErrorShapeMetadata().withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500));

        return clientHandler.execute(new ClientExecutionParams<GetServiceUserConsentRequest, GetServiceUserConsentResult>()
                .withMarshaller(new GetServiceUserConsentRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getServiceUserConsentRequest));
    }

    /**
     * @param listServiceUserConsentRequest
     * @return Result of the ListServiceUserConsent operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @sample ConsentManagementApi.ListServiceUserConsent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/ListServiceUserConsent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceUserConsentResult listServiceUserConsent(ListServiceUserConsentRequest listServiceUserConsentRequest) {
        HttpResponseHandler<ListServiceUserConsentResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceUserConsentResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(BadRequestException.class).withHttpStatusCode(400), new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500));

        return clientHandler.execute(new ClientExecutionParams<ListServiceUserConsentRequest, ListServiceUserConsentResult>()
                .withMarshaller(new ListServiceUserConsentRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(listServiceUserConsentRequest));
    }

    /**
     * @param updateServiceUserConsentRequest
     * @return Result of the UpdateServiceUserConsent operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ConflictException
     * @sample ConsentManagementApi.UpdateServiceUserConsent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/UpdateServiceUserConsent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceUserConsentResult updateServiceUserConsent(UpdateServiceUserConsentRequest updateServiceUserConsentRequest) {
        HttpResponseHandler<UpdateServiceUserConsentResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceUserConsentResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(NotFoundException.class).withHttpStatusCode(404),
                new JsonErrorShapeMetadata().withModeledClass(BadRequestException.class).withHttpStatusCode(400), new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500),
                new JsonErrorShapeMetadata().withModeledClass(ConflictException.class).withHttpStatusCode(409));

        return clientHandler.execute(new ClientExecutionParams<UpdateServiceUserConsentRequest, UpdateServiceUserConsentResult>()
                .withMarshaller(new UpdateServiceUserConsentRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(updateServiceUserConsentRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}

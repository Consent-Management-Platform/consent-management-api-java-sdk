/**

*/
package com.consentframework.consentmanagement.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.consentframework.consentmanagement.sdk.model.*;

/**
 * Interface for accessing ConsentManagementApi.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ConsentManagementApi {

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
    CreateServiceUserConsentResult createServiceUserConsent(CreateServiceUserConsentRequest createServiceUserConsentRequest);

    /**
     * @param getServiceUserConsentRequest
     * @return Result of the GetServiceUserConsent operation returned by the service.
     * @throws NotFoundException
     * @throws InternalServerErrorException
     * @sample ConsentManagementApi.GetServiceUserConsent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/GetServiceUserConsent"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceUserConsentResult getServiceUserConsent(GetServiceUserConsentRequest getServiceUserConsentRequest);

    /**
     * @param listServiceUserConsentRequest
     * @return Result of the ListServiceUserConsent operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @sample ConsentManagementApi.ListServiceUserConsent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/8x248cbkp8-2024-07-03/ListServiceUserConsent"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceUserConsentResult listServiceUserConsent(ListServiceUserConsentRequest listServiceUserConsentRequest);

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
    UpdateServiceUserConsentResult updateServiceUserConsent(UpdateServiceUserConsentRequest updateServiceUserConsentRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ConsentManagementApiClientBuilder builder() {
        return new ConsentManagementApiClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}

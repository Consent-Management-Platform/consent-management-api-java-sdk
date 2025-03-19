/**

*/
package com.consentframework.consentmanagement.sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.consentframework.consentmanagement.sdk.ConsentManagementApi}.
 * 
 * @see com.consentframework.consentmanagement.sdk.ConsentManagementApi#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ConsentManagementApiClientBuilder extends SdkSyncClientBuilder<ConsentManagementApiClientBuilder, ConsentManagementApi> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("8x248cbkp8.execute-api.us-west-2.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-west-2";

    /**
     * Package private constructor - builder should be created via {@link ConsentManagementApi#builder()}
     */
    ConsentManagementApiClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of ConsentManagementApi using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ConsentManagementApi.
     */
    @Override
    protected ConsentManagementApi build(AwsSyncClientParams params) {
        return new ConsentManagementApiClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}

/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.consentframework.consentmanagement.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetServiceUserConsentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceUserConsentResultJsonUnmarshaller implements Unmarshaller<GetServiceUserConsentResult, JsonUnmarshallerContext> {

    public GetServiceUserConsentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetServiceUserConsentResult getServiceUserConsentResult = new GetServiceUserConsentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getServiceUserConsentResult;
        }

        while (true) {
            if (token == null)
                break;

            getServiceUserConsentResult.setGetServiceUserConsentResponseContent(GetServiceUserConsentResponseContentJsonUnmarshaller.getInstance().unmarshall(
                    context));
            token = context.nextToken();
        }

        return getServiceUserConsentResult;
    }

    private static GetServiceUserConsentResultJsonUnmarshaller instance;

    public static GetServiceUserConsentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceUserConsentResultJsonUnmarshaller();
        return instance;
    }
}

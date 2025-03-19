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
 * CreateServiceUserConsentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceUserConsentResultJsonUnmarshaller implements Unmarshaller<CreateServiceUserConsentResult, JsonUnmarshallerContext> {

    public CreateServiceUserConsentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateServiceUserConsentResult createServiceUserConsentResult = new CreateServiceUserConsentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createServiceUserConsentResult;
        }

        while (true) {
            if (token == null)
                break;

            createServiceUserConsentResult.setCreateServiceUserConsentResponseContent(CreateServiceUserConsentResponseContentJsonUnmarshaller.getInstance()
                    .unmarshall(context));
            token = context.nextToken();
        }

        return createServiceUserConsentResult;
    }

    private static CreateServiceUserConsentResultJsonUnmarshaller instance;

    public static CreateServiceUserConsentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateServiceUserConsentResultJsonUnmarshaller();
        return instance;
    }
}

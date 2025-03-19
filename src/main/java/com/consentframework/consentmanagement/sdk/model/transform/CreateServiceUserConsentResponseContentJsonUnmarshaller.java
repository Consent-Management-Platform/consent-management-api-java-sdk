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
 * CreateServiceUserConsentResponseContent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceUserConsentResponseContentJsonUnmarshaller implements Unmarshaller<CreateServiceUserConsentResponseContent, JsonUnmarshallerContext> {

    public CreateServiceUserConsentResponseContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateServiceUserConsentResponseContent createServiceUserConsentResponseContent = new CreateServiceUserConsentResponseContent();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("consentId", targetDepth)) {
                    context.nextToken();
                    createServiceUserConsentResponseContent.setConsentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createServiceUserConsentResponseContent;
    }

    private static CreateServiceUserConsentResponseContentJsonUnmarshaller instance;

    public static CreateServiceUserConsentResponseContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateServiceUserConsentResponseContentJsonUnmarshaller();
        return instance;
    }
}

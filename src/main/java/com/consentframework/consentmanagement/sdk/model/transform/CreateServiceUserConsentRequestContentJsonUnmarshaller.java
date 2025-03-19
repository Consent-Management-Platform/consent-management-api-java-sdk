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
 * CreateServiceUserConsentRequestContent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceUserConsentRequestContentJsonUnmarshaller implements Unmarshaller<CreateServiceUserConsentRequestContent, JsonUnmarshallerContext> {

    public CreateServiceUserConsentRequestContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateServiceUserConsentRequestContent createServiceUserConsentRequestContent = new CreateServiceUserConsentRequestContent();

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
                if (context.testExpression("consentData", targetDepth)) {
                    context.nextToken();
                    createServiceUserConsentRequestContent.setConsentData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("consentType", targetDepth)) {
                    context.nextToken();
                    createServiceUserConsentRequestContent.setConsentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiryTime", targetDepth)) {
                    context.nextToken();
                    createServiceUserConsentRequestContent.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createServiceUserConsentRequestContent.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createServiceUserConsentRequestContent;
    }

    private static CreateServiceUserConsentRequestContentJsonUnmarshaller instance;

    public static CreateServiceUserConsentRequestContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateServiceUserConsentRequestContentJsonUnmarshaller();
        return instance;
    }
}

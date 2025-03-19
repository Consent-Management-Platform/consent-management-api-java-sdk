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
 * UpdateServiceUserConsentRequestContent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceUserConsentRequestContentJsonUnmarshaller implements Unmarshaller<UpdateServiceUserConsentRequestContent, JsonUnmarshallerContext> {

    public UpdateServiceUserConsentRequestContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateServiceUserConsentRequestContent updateServiceUserConsentRequestContent = new UpdateServiceUserConsentRequestContent();

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
                    updateServiceUserConsentRequestContent.setConsentData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("consentType", targetDepth)) {
                    context.nextToken();
                    updateServiceUserConsentRequestContent.setConsentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("consentVersion", targetDepth)) {
                    context.nextToken();
                    updateServiceUserConsentRequestContent.setConsentVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("expiryTime", targetDepth)) {
                    context.nextToken();
                    updateServiceUserConsentRequestContent.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateServiceUserConsentRequestContent.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateServiceUserConsentRequestContent;
    }

    private static UpdateServiceUserConsentRequestContentJsonUnmarshaller instance;

    public static UpdateServiceUserConsentRequestContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateServiceUserConsentRequestContentJsonUnmarshaller();
        return instance;
    }
}

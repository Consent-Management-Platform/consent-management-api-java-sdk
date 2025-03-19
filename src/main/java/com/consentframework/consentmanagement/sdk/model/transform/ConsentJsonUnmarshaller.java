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
 * Consent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsentJsonUnmarshaller implements Unmarshaller<Consent, JsonUnmarshallerContext> {

    public Consent unmarshall(JsonUnmarshallerContext context) throws Exception {
        Consent consent = new Consent();

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
                    consent.setConsentData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("consentId", targetDepth)) {
                    context.nextToken();
                    consent.setConsentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("consentType", targetDepth)) {
                    context.nextToken();
                    consent.setConsentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("consentVersion", targetDepth)) {
                    context.nextToken();
                    consent.setConsentVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("expiryTime", targetDepth)) {
                    context.nextToken();
                    consent.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("serviceId", targetDepth)) {
                    context.nextToken();
                    consent.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    consent.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userId", targetDepth)) {
                    context.nextToken();
                    consent.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return consent;
    }

    private static ConsentJsonUnmarshaller instance;

    public static ConsentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConsentJsonUnmarshaller();
        return instance;
    }
}

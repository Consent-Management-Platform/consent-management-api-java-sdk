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
 * GetServiceUserConsentResponseContent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceUserConsentResponseContentJsonUnmarshaller implements Unmarshaller<GetServiceUserConsentResponseContent, JsonUnmarshallerContext> {

    public GetServiceUserConsentResponseContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetServiceUserConsentResponseContent getServiceUserConsentResponseContent = new GetServiceUserConsentResponseContent();

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
                if (context.testExpression("data", targetDepth)) {
                    context.nextToken();
                    getServiceUserConsentResponseContent.setData(ConsentJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getServiceUserConsentResponseContent;
    }

    private static GetServiceUserConsentResponseContentJsonUnmarshaller instance;

    public static GetServiceUserConsentResponseContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceUserConsentResponseContentJsonUnmarshaller();
        return instance;
    }
}

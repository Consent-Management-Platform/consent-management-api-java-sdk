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
 * ListServiceUserConsentResponseContent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceUserConsentResponseContentJsonUnmarshaller implements Unmarshaller<ListServiceUserConsentResponseContent, JsonUnmarshallerContext> {

    public ListServiceUserConsentResponseContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListServiceUserConsentResponseContent listServiceUserConsentResponseContent = new ListServiceUserConsentResponseContent();

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
                    listServiceUserConsentResponseContent.setData(new ListUnmarshaller<Consent>(ConsentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("nextPageToken", targetDepth)) {
                    context.nextToken();
                    listServiceUserConsentResponseContent.setNextPageToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listServiceUserConsentResponseContent;
    }

    private static ListServiceUserConsentResponseContentJsonUnmarshaller instance;

    public static ListServiceUserConsentResponseContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListServiceUserConsentResponseContentJsonUnmarshaller();
        return instance;
    }
}

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
 * ListServiceUserConsentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceUserConsentResultJsonUnmarshaller implements Unmarshaller<ListServiceUserConsentResult, JsonUnmarshallerContext> {

    public ListServiceUserConsentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListServiceUserConsentResult listServiceUserConsentResult = new ListServiceUserConsentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listServiceUserConsentResult;
        }

        while (true) {
            if (token == null)
                break;

            listServiceUserConsentResult.setListServiceUserConsentResponseContent(ListServiceUserConsentResponseContentJsonUnmarshaller.getInstance()
                    .unmarshall(context));
            token = context.nextToken();
        }

        return listServiceUserConsentResult;
    }

    private static ListServiceUserConsentResultJsonUnmarshaller instance;

    public static ListServiceUserConsentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListServiceUserConsentResultJsonUnmarshaller();
        return instance;
    }
}

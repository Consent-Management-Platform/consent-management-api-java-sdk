/**

*/
package com.consentframework.consentmanagement.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.consentframework.consentmanagement.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateServiceUserConsentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceUserConsentResultJsonUnmarshaller implements Unmarshaller<UpdateServiceUserConsentResult, JsonUnmarshallerContext> {

    public UpdateServiceUserConsentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateServiceUserConsentResult updateServiceUserConsentResult = new UpdateServiceUserConsentResult();

        return updateServiceUserConsentResult;
    }

    private static UpdateServiceUserConsentResultJsonUnmarshaller instance;

    public static UpdateServiceUserConsentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateServiceUserConsentResultJsonUnmarshaller();
        return instance;
    }
}

/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegisterOnPremisesInstanceResult JSON Unmarshaller
 */
public class RegisterOnPremisesInstanceResultJsonUnmarshaller implements Unmarshaller<RegisterOnPremisesInstanceResult, JsonUnmarshallerContext> {

    public RegisterOnPremisesInstanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegisterOnPremisesInstanceResult registerOnPremisesInstanceResult = new RegisterOnPremisesInstanceResult();

        return registerOnPremisesInstanceResult;
    }

    private static RegisterOnPremisesInstanceResultJsonUnmarshaller instance;

    public static RegisterOnPremisesInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisterOnPremisesInstanceResultJsonUnmarshaller();
        return instance;
    }
}

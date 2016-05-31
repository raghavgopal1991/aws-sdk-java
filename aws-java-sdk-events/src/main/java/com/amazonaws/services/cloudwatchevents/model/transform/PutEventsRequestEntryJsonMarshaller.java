/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudwatchevents.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PutEventsRequestEntryMarshaller
 */
public class PutEventsRequestEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PutEventsRequestEntry putEventsRequestEntry,
            StructuredJsonGenerator jsonGenerator) {

        if (putEventsRequestEntry == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (putEventsRequestEntry.getTime() != null) {
                jsonGenerator.writeFieldName("Time").writeValue(
                        putEventsRequestEntry.getTime());
            }
            if (putEventsRequestEntry.getSource() != null) {
                jsonGenerator.writeFieldName("Source").writeValue(
                        putEventsRequestEntry.getSource());
            }

            java.util.List<String> resourcesList = putEventsRequestEntry
                    .getResources();
            if (resourcesList != null) {
                jsonGenerator.writeFieldName("Resources");
                jsonGenerator.writeStartArray();
                for (String resourcesListValue : resourcesList) {
                    if (resourcesListValue != null) {
                        jsonGenerator.writeValue(resourcesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (putEventsRequestEntry.getDetailType() != null) {
                jsonGenerator.writeFieldName("DetailType").writeValue(
                        putEventsRequestEntry.getDetailType());
            }
            if (putEventsRequestEntry.getDetail() != null) {
                jsonGenerator.writeFieldName("Detail").writeValue(
                        putEventsRequestEntry.getDetail());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PutEventsRequestEntryJsonMarshaller instance;

    public static PutEventsRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutEventsRequestEntryJsonMarshaller();
        return instance;
    }

}
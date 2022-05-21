/*
 * Copyright 2017-2022 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.tracing.opentelemetry.instrument.http.client;

import io.micronaut.context.annotation.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;


@ConfigurationProperties(value = OpenTelemetryHttpClientConfig.PREFIX)
public class OpenTelemetryHttpClientConfig {
    public static final String PREFIX = "otel.http.client";

    private List<String> responseHeaders = new ArrayList<>();
    private List<String> requestHeaders = new ArrayList<>();

    public List<String> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(List<String> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public List<String> getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(List<String> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }
}

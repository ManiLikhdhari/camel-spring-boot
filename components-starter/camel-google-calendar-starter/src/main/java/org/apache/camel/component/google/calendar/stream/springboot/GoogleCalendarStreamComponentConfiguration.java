/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.google.calendar.stream.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The google-calendar component provides access to Google Calendar in a
 * streaming mode.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.google-calendar-stream")
public class GoogleCalendarStreamComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the google-calendar-stream
     * component. This is enabled by default.
     */
    private Boolean enabled;
    /**
     * The configuration
     */
    private GoogleCalendarStreamConfigurationNestedConfiguration configuration;
    /**
     * The client Factory. The option is a
     * org.apache.camel.component.google.calendar.GoogleCalendarClientFactory
     * type.
     */
    private String clientFactory;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public GoogleCalendarStreamConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            GoogleCalendarStreamConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getClientFactory() {
        return clientFactory;
    }

    public void setClientFactory(String clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class GoogleCalendarStreamConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration.class;
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         */
        private String accessToken;
        /**
         * Google Calendar application name. Example would be
         * camel-google-calendar/1.0
         */
        private String applicationName;
        /**
         * The calendarId to be used
         */
        private String calendarId = "primary";
        /**
         * Client ID of the calendar application
         */
        private String clientId;
        /**
         * Client secret of the calendar application
         */
        private String clientSecret;
        /**
         * Take into account the lastUpdate of the last event polled as start
         * date for the next poll
         */
        private Boolean considerLastUpdate = false;
        /**
         * Consume events in the selected calendar from now on
         */
        private Boolean consumeFromNow = true;
        /**
         * Specifies an index for the endpoint
         */
        private String index;
        /**
         * Max results to be returned
         */
        private Integer maxResults = 10;
        /**
         * The query to execute on calendar
         */
        private String query;
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         */
        private String refreshToken;
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. See
         * https://developers.google.com/calendar/auth for more info.
         */
        private List scopes;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getApplicationName() {
            return applicationName;
        }

        public void setApplicationName(String applicationName) {
            this.applicationName = applicationName;
        }

        public String getCalendarId() {
            return calendarId;
        }

        public void setCalendarId(String calendarId) {
            this.calendarId = calendarId;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public Boolean getConsiderLastUpdate() {
            return considerLastUpdate;
        }

        public void setConsiderLastUpdate(Boolean considerLastUpdate) {
            this.considerLastUpdate = considerLastUpdate;
        }

        public Boolean getConsumeFromNow() {
            return consumeFromNow;
        }

        public void setConsumeFromNow(Boolean consumeFromNow) {
            this.consumeFromNow = consumeFromNow;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public Integer getMaxResults() {
            return maxResults;
        }

        public void setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        public List getScopes() {
            return scopes;
        }

        public void setScopes(List scopes) {
            this.scopes = scopes;
        }
    }
}
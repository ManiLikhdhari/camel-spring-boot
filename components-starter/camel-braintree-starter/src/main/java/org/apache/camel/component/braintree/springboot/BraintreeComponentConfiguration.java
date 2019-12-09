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
package org.apache.camel.component.braintree.springboot;

import java.util.logging.Level;
import javax.annotation.Generated;
import org.apache.camel.component.braintree.internal.BraintreeApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The braintree component is used for integrating with the Braintree Payment
 * System.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.braintree")
public class BraintreeComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the braintree component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private BraintreeConfigurationNestedConfiguration configuration;
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

    public BraintreeConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            BraintreeConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
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

    public static class BraintreeConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.braintree.BraintreeConfiguration.class;
        /**
         * The access token granted by a merchant to another in order to process
         * transactions on their behalf. Used in place of environment, merchant
         * id, public key and private key fields.
         */
        private String accessToken;
        /**
         * What kind of operation to perform
         */
        private BraintreeApiName apiName;
        /**
         * The environment Either SANDBOX or PRODUCTION
         */
        private String environment;
        /**
         * Set logging level for http calls, see java.util.logging.Level
         */
        private Level httpLogLevel;
        private String httpLogName;
        /**
         * Set read timeout for http calls.
         */
        private Integer httpReadTimeout;
        /**
         * The merchant id provided by Braintree.
         */
        private String merchantId;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * The private key provided by Braintree.
         */
        private String privateKey;
        /**
         * The proxy host
         */
        private String proxyHost;
        /**
         * The proxy port
         */
        private Integer proxyPort;
        /**
         * The public key provided by Braintree.
         */
        private String publicKey;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public BraintreeApiName getApiName() {
            return apiName;
        }

        public void setApiName(BraintreeApiName apiName) {
            this.apiName = apiName;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }

        public Level getHttpLogLevel() {
            return httpLogLevel;
        }

        public void setHttpLogLevel(Level httpLogLevel) {
            this.httpLogLevel = httpLogLevel;
        }

        public String getHttpLogName() {
            return httpLogName;
        }

        public void setHttpLogName(String httpLogName) {
            this.httpLogName = httpLogName;
        }

        public Integer getHttpReadTimeout() {
            return httpReadTimeout;
        }

        public void setHttpReadTimeout(Integer httpReadTimeout) {
            this.httpReadTimeout = httpReadTimeout;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }
    }
}
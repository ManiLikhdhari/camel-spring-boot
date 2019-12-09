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
package org.apache.camel.component.iec60870.server.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.eclipse.neoscada.protocol.iec60870.server.data.DataModuleOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * IEC 60870 component used for telecontrol (supervisory control and data
 * acquisition) such as controlling electric power transmission grids and other
 * geographically widespread control systems.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.iec60870-server")
public class ServerComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the iec60870-server component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Default connection options
     */
    private ServerOptionsNestedConfiguration defaultConnectionOptions;
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

    public ServerOptionsNestedConfiguration getDefaultConnectionOptions() {
        return defaultConnectionOptions;
    }

    public void setDefaultConnectionOptions(
            ServerOptionsNestedConfiguration defaultConnectionOptions) {
        this.defaultConnectionOptions = defaultConnectionOptions;
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

    public static class ServerOptionsNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.iec60870.server.ServerOptions.class;
        private Integer backgroundScanPeriod;
        private Boolean booleansWithTimestamp;
        private Integer bufferingPeriod;
        /**
         * Data module options
         */
        private DataModuleOptions dataModuleOptions;
        private Boolean floatsWithTimestamp;
        private Integer spontaneousDuplicates;

        public Integer getBackgroundScanPeriod() {
            return backgroundScanPeriod;
        }

        public void setBackgroundScanPeriod(Integer backgroundScanPeriod) {
            this.backgroundScanPeriod = backgroundScanPeriod;
        }

        public Boolean getBooleansWithTimestamp() {
            return booleansWithTimestamp;
        }

        public void setBooleansWithTimestamp(Boolean booleansWithTimestamp) {
            this.booleansWithTimestamp = booleansWithTimestamp;
        }

        public Integer getBufferingPeriod() {
            return bufferingPeriod;
        }

        public void setBufferingPeriod(Integer bufferingPeriod) {
            this.bufferingPeriod = bufferingPeriod;
        }

        public DataModuleOptions getDataModuleOptions() {
            return dataModuleOptions;
        }

        public void setDataModuleOptions(DataModuleOptions dataModuleOptions) {
            this.dataModuleOptions = dataModuleOptions;
        }

        public Boolean getFloatsWithTimestamp() {
            return floatsWithTimestamp;
        }

        public void setFloatsWithTimestamp(Boolean floatsWithTimestamp) {
            this.floatsWithTimestamp = floatsWithTimestamp;
        }

        public Integer getSpontaneousDuplicates() {
            return spontaneousDuplicates;
        }

        public void setSpontaneousDuplicates(Integer spontaneousDuplicates) {
            this.spontaneousDuplicates = spontaneousDuplicates;
        }
    }
}
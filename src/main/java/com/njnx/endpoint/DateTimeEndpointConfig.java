package com.njnx.endpoint;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:scott
 * @Description
 * @Date: 2020-11-22
 */
@Configuration
public class DateTimeEndpointConfig {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnEnabledEndpoint
    public DateTimeEndPoint dateTimeEndPoint() {
        return new DateTimeEndPoint();
    }


}

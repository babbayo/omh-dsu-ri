/*
 * Copyright 2014 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.dsu.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;


/**
 * A configuration that creates a JSR-303 Bean Validation API validator.
 *
 * @author Emerson Farrugia
 */
@Configuration
public class ValidationConfiguration {

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean() {

        return new LocalValidatorFactoryBean();
    }

    @Bean
    public Validator validator(LocalValidatorFactoryBean factoryBean) {

        return factoryBean.getValidator();
    }
}

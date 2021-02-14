/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author David Juajinoy
 */

@Configuration
public class AppConfig {

    @Bean("ClienteRest")
    public RestTemplate registrarRestTemplate() {
	return new RestTemplate();
    }

}

package com.nrsc.springstudy.c3_factorybean.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {MyFactoryBean.class})
public class FactoryBeanConfig2 {
}

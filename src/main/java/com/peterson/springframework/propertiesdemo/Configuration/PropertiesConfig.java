package com.peterson.springframework.propertiesdemo.Configuration;

import com.peterson.springframework.propertiesdemo.Repository.DummyDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertiesConfig {

    @Value("${peter.name}")
    String name;
    @Value("${peter.password}")
    String password;
    @Value("$peter.url")
    String url;

    @Bean
    public DummyDatasource dummyDatasource(){
    DummyDatasource dummyDatasource=new DummyDatasource();
    dummyDatasource.setName(name);
    dummyDatasource.setName(password);
    dummyDatasource.setName(url);
    return dummyDatasource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

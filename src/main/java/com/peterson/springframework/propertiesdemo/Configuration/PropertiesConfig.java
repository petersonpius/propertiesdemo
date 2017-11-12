package com.peterson.springframework.propertiesdemo.Configuration;

import com.peterson.springframework.propertiesdemo.Repository.DummyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertiesConfig {
    @Autowired
    private Environment env;

    @Value("${peter.name}")
    String name;
    @Value("${peter.password}")
    String password;
    @Value("${peter.url}")
    String url;

    @Bean
    public DummyDatasource dummyDatasource(){
        DummyDatasource dummyDatasource=new DummyDatasource();
        dummyDatasource.setName(env.getProperty("NAME"));
        // dummyDatasource.setName(name);
        dummyDatasource.setPassword(password);
        dummyDatasource.setUrl(url);
        return dummyDatasource;
       // return new DummyDatasource(name,password,url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

package com.peterson.springframework.propertiesdemo.Repository;

import org.springframework.stereotype.Component;

//@Component
public class DummyDatasource {
    private String name;
    private String password;
    private String url;

    public DummyDatasource() {

    }

    public DummyDatasource(String name, String password, String url) {
        this.name = name;
        this.password = password;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

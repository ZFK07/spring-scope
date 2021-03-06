package com.learning.springbeanscopes.scopes.request.service;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Scope(value = WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class RequestScopedBean {
    String websiteName = "www.islamqa.com";

    public RequestScopedBean() {
        System.out.println(this.getClass().getSimpleName() + " object has been created.");
    }
}

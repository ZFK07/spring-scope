package com.learning.springbeanscopes.scopes.session.service;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalTime;

@Component(value = "sessionScopedBean")
@SessionScope
@Data
public class SessionScopedBean {
    String websiteName = "www.islamqa.com";

    public SessionScopedBean() {
        System.out.println(this.getClass().getSimpleName() + " object has been created at " + LocalTime.now().getSecond());
    }
}

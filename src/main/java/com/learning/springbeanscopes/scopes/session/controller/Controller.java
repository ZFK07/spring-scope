package com.learning.springbeanscopes.scopes.session.controller;

import com.learning.springbeanscopes.scopes.session.service.SessionScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController(value = "sessionController")
@RequestMapping("/session")
public class Controller {
    @Autowired
    SessionScopedBean sessionScopedBean;
    @Autowired
    WebApplicationContext webApplicationContext;


    @GetMapping
    public void testGetMapping(HttpServletResponse response) throws IOException {
        SessionScopedBean sessionScopedBean1 = webApplicationContext.getBean("sessionScopedBean", SessionScopedBean.class);
        SessionScopedBean sessionScopedBean2 = webApplicationContext.getBean("sessionScopedBean", SessionScopedBean.class);
        assert  sessionScopedBean1==sessionScopedBean2;
        System.out.println(""+ sessionScopedBean1 + sessionScopedBean2 );

    }
}

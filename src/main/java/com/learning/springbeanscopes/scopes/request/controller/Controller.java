package com.learning.springbeanscopes.scopes.request.controller;

import com.learning.springbeanscopes.scopes.request.service.RequestScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/request")
public class Controller {
    @Autowired
    RequestScopedBean requestScopedBean;


    @GetMapping
    public void testGetMapping(HttpServletResponse response) throws IOException {
        response.getWriter().write("Old website name " + requestScopedBean.getWebsiteName());
        requestScopedBean.setWebsiteName("www.facebook.com");
        response.getWriter().write("New website name " + requestScopedBean.getWebsiteName());
    }
}

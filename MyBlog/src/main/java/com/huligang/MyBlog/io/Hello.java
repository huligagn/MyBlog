package com.huligang.MyBlog.io;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class Hello {

    @GetMapping("/all")
    public String hello() {
        return "Hello world";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHello() {
        return "Hello secured world";
    }
}

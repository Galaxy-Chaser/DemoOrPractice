package org.example.demos.jwt_demoAndInterceptorDemo.controllers;

import org.example.demos.jwt_demoAndInterceptorDemo.pojo.Emp;
import org.example.demos.jwt_demoAndInterceptorDemo.pojo.JwtPojo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class Controller {

    @PostMapping
    public String login(@RequestBody Emp emp) {
        if(emp.getName().equals("admin") && emp.getPassword().equals("123456")) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", emp.getName());
            JwtPojo jwtPojo = new JwtPojo();
            return jwtPojo.GenJwt(map);
        }
        return null;
    }
}

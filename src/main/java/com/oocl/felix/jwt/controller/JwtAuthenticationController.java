package com.oocl.felix.jwt.controller;

import com.oocl.felix.jwt.http.JwtRequest;
import com.oocl.felix.jwt.service.JwtAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private JwtAuthenticationService jwtAuthenticationService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody JwtRequest request) {
        return jwtAuthenticationService.authenticate(request);
    }
}

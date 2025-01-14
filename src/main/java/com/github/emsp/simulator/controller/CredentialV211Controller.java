package com.github.emsp.simulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.Response;

@RestController
public class CredentialV211Controller {

    @PostMapping("/ocpi/emsp/2.1.1/credentials")
    public ResponseEntity<Response<String>> geCredentials211() {
        Response<String> response = new Response<>();
        response.setData("Success");
        return ResponseEntity.ok().body(response);
    }

}

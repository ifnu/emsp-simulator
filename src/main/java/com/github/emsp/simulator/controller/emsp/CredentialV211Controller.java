package com.github.emsp.simulator.controller.emsp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.emsp.ResponseNoData;

@RestController
public class CredentialV211Controller {

    @GetMapping("/ocpi/emsp/2.1.1/credentials")
    public ResponseEntity<ResponseNoData> getCredentials211() {
        ResponseNoData response = new ResponseNoData();
        return ResponseEntity.ok().body(response);
    }

}

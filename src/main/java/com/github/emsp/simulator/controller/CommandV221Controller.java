package com.github.emsp.simulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.ResponseNoData;

@RestController
public class CommandV221Controller {

    @PostMapping("/ocpi/emsp/2.2.1/commands/{commandType}")
    public ResponseEntity<ResponseNoData> geCredentials211(@PathVariable String commandType) {
        ResponseNoData response = new ResponseNoData();
        return ResponseEntity.ok().body(response);
    }
}

package com.github.emsp.simulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.CommandResult;
import com.github.emsp.simulator.model.ResponseNoData;

@RestController
public class CommandV211Controller {

    @PostMapping("/ocpi/emsp/2.1.1/commands/{commandType}/{uid}")
    public ResponseEntity<ResponseNoData> postCommand(
            @RequestBody CommandResult result,
            @PathVariable String commandType,
            @PathVariable String uid) {
        ResponseNoData response = new ResponseNoData();
        return ResponseEntity.ok().body(response);
    }
}

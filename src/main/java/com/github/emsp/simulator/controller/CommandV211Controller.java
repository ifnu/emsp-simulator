package com.github.emsp.simulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.CommandResponse;
import com.github.emsp.simulator.model.Response;

@RestController
public class CommandV211Controller {

    @PostMapping("/ocpi/emsp/2.1.1/commands/{commandType}")
    public ResponseEntity<Response<CommandResponse>> postCommand(@PathVariable String commandType) {
        Response<CommandResponse> response = new Response<>();
        CommandResponse commandResponse = new CommandResponse();
        commandResponse.setResult("ACCEPTED");
        return ResponseEntity.ok().body(response);
    }
}

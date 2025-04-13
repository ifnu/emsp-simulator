package com.github.emsp.simulator.controller.emsp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.common.HandshakeRequest;
import com.github.emsp.simulator.model.common.Status;

@RestController
@RequestMapping("/api")
public class HandshakeController {

    @PostMapping("/handshake")
    public ResponseEntity<Status> postHandShake(
            @RequestBody HandshakeRequest request,
            @RequestHeader(name = "Authorization", required = false) String token) {
        if (token == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        return ResponseEntity.ok().body(Status.ok());
    }

}

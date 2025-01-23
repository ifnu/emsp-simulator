package com.github.emsp.simulator.controller.cpo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.cpo.LocationRemoteStartDto;
import com.github.emsp.simulator.model.cpo.RemoteCommandResult;

@RestController
public class CommandController {

    @PostMapping("/v1/locations/{locationId}/remotestartinternal")
    public ResponseEntity<RemoteCommandResult> postStartSession(
            @RequestBody LocationRemoteStartDto requestBody,
            @PathVariable String locationId) {

        RemoteCommandResult response = new RemoteCommandResult();
        response.setType("START_SESSION");
        response.setIsOk(true);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/v1/locations/{locationId}/remotestopinternal/{sessionId}")
    public ResponseEntity<RemoteCommandResult> postStopSession(
            @PathVariable String locationId,
            @PathVariable String sessionId,
            @RequestParam String uniqueId) {

        RemoteCommandResult response = new RemoteCommandResult();
        response.setType("STOP_SESSION");
        response.setIsOk(true);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/v1/locations/{locationId}/unlockconnectorinternal/{connectorId}")
    public ResponseEntity<RemoteCommandResult> postUnlockConnector(
            @PathVariable String locationId,
            @PathVariable String connectorId,
            @RequestParam String uniqueId) {

        RemoteCommandResult response = new RemoteCommandResult();
        response.setType("UNLOCK_CONNECTOR");
        response.setIsOk(true);
        return ResponseEntity.ok().body(response);
    }

}

package com.github.emsp.simulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.Response;
import com.github.emsp.simulator.model.Version;

@RestController
public class VersionV221Controller {
    

    @GetMapping("/ocpi/emsp/2.2.1/versions")
    public ResponseEntity<Response<Version>> getVersion211(){
        //validate Token A
        Response<Version> versionResponse = new Response<>();
        versionResponse.setData(new Version("2.2.1", "http://103.127.97.27:8081/ocpi/emsp/2.2.1/"));
        return ResponseEntity.ok().body(versionResponse);

    }
    

}

package com.github.emsp.simulator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.Response;
import com.github.emsp.simulator.model.Version;

@RestController
public class VersionV221Controller {
    

    @GetMapping("/ocpi/emsp/2.2.1/versions")
    public ResponseEntity<Response<List<Version>>> getVersion221(){ 
        //validate Token A
        Response<List<Version>> versionResponse = new Response<>();
        List<Version> versions = new ArrayList<>();
        versions.add(new Version("2.1.1", "http://103.127.97.27:8081/ocpi/emsp/2.1.1/"));
        versions.add(new Version("2.2.1", "http://103.127.97.27:8081/ocpi/emsp/2.2.1/"));
        versionResponse.setData(versions);
        return ResponseEntity.ok().body(versionResponse);

    }
    

}

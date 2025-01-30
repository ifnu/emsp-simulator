package com.github.emsp.simulator.controller.emsp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.emsp.Response;
import com.github.emsp.simulator.model.emsp.Version;

@RestController
public class VersionV211Controller {

    @GetMapping("/ocpi/emsp/2.1.1/versions")
    public ResponseEntity<Response<List<Version>>> getVersion211() {
        // validate Token A
        Response<List<Version>> versionResponse = new Response<>();
        List<Version> versions = new ArrayList<>();
        versions.add(new Version("2.1.1", "https://emspsimulator.com/ocpi/emsp/2.1.1/"));
        versions.add(new Version("2.2.1", "https://emspsimulator.com/ocpi/emsp/2.2.1/"));
        versionResponse.setData(versions);
        return ResponseEntity.ok().body(versionResponse);

    }

}

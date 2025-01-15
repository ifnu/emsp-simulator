package com.github.emsp.simulator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.Endpoint;
import com.github.emsp.simulator.model.Endpoints;
import com.github.emsp.simulator.model.Response;

@RestController
public class EndpointV221Controller {

    @GetMapping("/ocpi/emsp/2.2.1/")
    public ResponseEntity<Response<Endpoints>> getEndpoint211(){
        //validate Token A
        Endpoints endpoints = new Endpoints();
        endpoints.setVersion("2.2.1");
        List<Endpoint> endpointList = new ArrayList<>();
        Endpoint endpoint = new Endpoint();
        endpoint.setIdentifier("credentials");
        endpoint.setUrl("http://103.127.97.27:8081/ocpi/emsp/2.2.1/credentials");
        endpointList.add(endpoint);
        endpoint = new Endpoint();
        endpoint.setIdentifier("locations");
        endpoint.setUrl("http://103.127.97.27:8081/ocpi/emsp/2.2.1/locations");
        endpointList.add(endpoint);
        endpoints.setEndpoints(endpointList);
        endpoint = new Endpoint();
        endpoint.setIdentifier("commands");
        endpoint.setUrl("http://103.127.97.27:8081/ocpi/emsp/2.2.1/commands");
        endpointList.add(endpoint);
        endpoints.setEndpoints(endpointList);
        Response<Endpoints> endpointsResponse = new Response<>();
        endpointsResponse.setData(endpoints);
        return ResponseEntity.ok().body(endpointsResponse);

    }
}

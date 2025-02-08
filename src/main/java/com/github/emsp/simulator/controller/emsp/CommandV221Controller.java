package com.github.emsp.simulator.controller.emsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.emsp.simulator.entity.Request;
import com.github.emsp.simulator.model.emsp.CommandResult;
import com.github.emsp.simulator.model.emsp.ResponseNoData;
import com.github.emsp.simulator.repository.RequestRepository;

@RestController
public class CommandV221Controller {

    @Autowired
    private RequestRepository repository;

    private ObjectMapper objectMapper = new ObjectMapper();
    
    @PostMapping("/ocpi/emsp/2.2.1/commands/{commandType}/{uid}")
    public ResponseEntity<ResponseNoData> postCommand(
            @RequestBody CommandResult result,
            @PathVariable String commandType,
            @PathVariable String uid) {

        Request request = new Request();
        request.setModule("commands " + commandType);
        request.setParty("eMSP");
        request.setVersion("ocpi v2.1.1");
        request.setUid(uid);
        try {
            request.setData(objectMapper.writeValueAsString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }

        repository.save(request);

        ResponseNoData response = new ResponseNoData();
        return ResponseEntity.ok().body(response);
    }
}

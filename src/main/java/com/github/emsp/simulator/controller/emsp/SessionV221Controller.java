package com.github.emsp.simulator.controller.emsp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.entity.Request;
import com.github.emsp.simulator.model.emsp.ResponseNoData;
import com.github.emsp.simulator.repository.RequestRepository;

@RestController
public class SessionV221Controller {
    
    //PUT and Patch
    @Autowired
    private RequestRepository repository;
    

    @PutMapping("/ocpi/emsp/2.2.1/sessions")
    public ResponseEntity<ResponseNoData> postSession(@RequestBody String json){
        Request request = new Request();
        request.setUid("xyz");
        request.setParty("eMSP");
        request.setVersion("ocpi v2.2.1");
        request.setModule("sessions");
        request.setDate(new Date());
        request.setData(json);
        repository.save(request);
        ResponseNoData responseNoData = new ResponseNoData();
        return ResponseEntity.ok().body(responseNoData);
    }

}

package com.github.emsp.simulator.controller.emsp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.entity.Request;
import com.github.emsp.simulator.model.emsp.ResponseNoData;
import com.github.emsp.simulator.repository.RequestRepository;

@RestController
public class SessionV211Controller {

    // PUT and Patch
    @Autowired
    private RequestRepository repository;

    // https://emspsimulator.com/ocpi/emsp/2.1.1/sessions/ID/HWK/443E6420-0239-49D6-A714-9BF62AFAC16B'
    @PutMapping("/ocpi/emsp/2.1.1/sessions/{countryCode}/{partyId}/{uid}")
    public ResponseEntity<ResponseNoData> postSession(
            @RequestBody String json,
            @PathVariable String countryCode,
            @PathVariable String partyId,
            @PathVariable String uid) {
        Request request = new Request();
        request.setUid(uid);
        request.setParty("eMSP");
        request.setVersion("ocpi v2.1.1");
        request.setModule("sessions");
        request.setDate(new Date());
        request.setData("countryCode:" + countryCode + ", partyId:" + partyId + ", json:" + json);
        repository.save(request);
        ResponseNoData responseNoData = new ResponseNoData();
        return ResponseEntity.ok().body(responseNoData);
    }

}

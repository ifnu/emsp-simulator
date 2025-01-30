package com.github.emsp.simulator.controller.emsp;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.emsp.BusinessDetail;
import com.github.emsp.simulator.model.emsp.Credential211;
import com.github.emsp.simulator.model.emsp.Logo;
import com.github.emsp.simulator.model.emsp.Response;
import com.github.emsp.simulator.model.emsp.ResponseNoData;

@RestController
public class CredentialV211Controller {

    @GetMapping("/ocpi/emsp/2.1.1/credentials")
    public ResponseEntity<ResponseNoData> getCredentials211() {
        ResponseNoData response = new ResponseNoData();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/ocpi/emsp/2.1.1/credentials")
    public ResponseEntity<Response<Credential211>> postCredentials211() {
        Response<Credential211> r = new Response<>();
        
        Credential211 c = new Credential211();
        c.setToken(UUID.randomUUID().toString());
        c.setUrl(("https://emspsimulator.com/ocpi/emsp/2.1.1/versions"));
        c.setCountryCode("ID");
        c.setPartyId("IFN");
        
        BusinessDetail bd = new BusinessDetail();
        bd.setName("EMSP Simulator");
        bd.setWebsite("https://emspsimulator.com");
        Logo logo = new Logo();
        logo.setUrl("https://emspsimulator.com/logo.jpg");
        logo.setThumbnail("https://emspsimulator.com/logo-thumbnail.jpg");
        logo.setWidth(400);
        logo.setHeight(400);
        logo.setCategory("OTHER");
        logo.setType("jpg");
        bd.setLogo(logo);
        c.setBusinessDetails(bd);

        r.setData(c);
        return ResponseEntity.ok().body(r);
    }
}

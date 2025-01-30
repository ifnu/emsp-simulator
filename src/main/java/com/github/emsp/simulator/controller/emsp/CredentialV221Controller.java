package com.github.emsp.simulator.controller.emsp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.emsp.simulator.model.emsp.BusinessDetail;
import com.github.emsp.simulator.model.emsp.Credential221;
import com.github.emsp.simulator.model.emsp.Logo;
import com.github.emsp.simulator.model.emsp.Response;
import com.github.emsp.simulator.model.emsp.ResponseNoData;
import com.github.emsp.simulator.model.emsp.Role;

@RestController
public class CredentialV221Controller {

    @GetMapping("/ocpi/emsp/2.2.1/credentials")
    public ResponseEntity<ResponseNoData> getCredentials221() {
        ResponseNoData response = new ResponseNoData();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/ocpi/emsp/2.2.1/credentials")
    public ResponseEntity<Response<Credential221>> postCredentials221() {
        Response<Credential221> response = new Response<>();

        Credential221 c = new Credential221();
        c.setToken(UUID.randomUUID().toString());
        c.setUrl(("https://emspsimulator.com/ocpi/emsp/2.2.1/versions"));
        
        List<Role> roles = new ArrayList<>();
        c.setRoles(roles);
        Role r = new Role();
        r.setCountryCode("ID");
        r.setPartyId("IFN");
        r.setRole("EMSP");
        

        List<BusinessDetail> businessDetails = new ArrayList<>();
        BusinessDetail bd = new BusinessDetail();
        bd.setName("EMSP Simulator");
        bd.setWebsite("https://emspsimulator.com");
        businessDetails.add(bd);
        r.setBusinessDetails(businessDetails);
        
        Logo logo = new Logo();
        logo.setUrl("https://emspsimulator.com/logo.jpg");
        logo.setThumbnail("https://emspsimulator.com/logo-thumbnail.jpg");
        logo.setWidth(400);
        logo.setHeight(400);
        logo.setCategory("OTHER");
        logo.setType("jpg");
        bd.setLogo(logo);
        roles.add(r);

    
        response.setData(c);
        return ResponseEntity.ok().body(response);
    }

}

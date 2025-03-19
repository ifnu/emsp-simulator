package com.github.emsp.simulator.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.github.emsp.simulator.entity.Request;
import com.github.emsp.simulator.repository.RequestRepository;

@Service
public class JitterSimulatorService {

    @Autowired
    private RequestRepository repository;

    public Integer simulateJitter(String uid, Integer retry, Integer status, Integer timeout) {
        if (status != null && uid != null && retry != null) {

            Integer currentRetry = 1;
            List<Request> requests = repository.findByUidOrderByDateAsc(uid);
            Request request = new Request();
            if (!requests.isEmpty()) {
                currentRetry = requests.size() + 1;
                if (currentRetry >= retry) {
                    status = 200;
                }
            }
            if (timeout != null && timeout > 0 && currentRetry < retry) {
                try {
                    Thread.sleep(timeout * 1_000);
                } catch (Exception ex) {
                    // intentionally left blank
                }
            }
            request.setModule("endpoint module");
            request.setDate(new Date());
            request.setParty("eMSP");
            request.setVersion("ocpi v2.1.1");
            request.setData("max retry:" + retry + ", retry: " + currentRetry + ", status:" + status);
            request.setUid(uid);
            repository.save(request);
            return status;
        }
        return HttpStatus.OK.value();
    }

    public Integer simulateJitter(String uid, Integer retry, Integer status, Integer timeout, Request request) {
        if (status != null && uid != null && retry != null) {
            Integer currentRetry = 1;
            List<Request> requests = repository.findByUidOrderByDateAsc(uid);
            if (!requests.isEmpty()) {
                currentRetry = requests.size() + 1;
                if (currentRetry >= retry) {
                    status = 200;
                }
            }
            if (timeout != null && timeout > 0 && currentRetry < retry) {
                try {
                    Thread.sleep(timeout * 1_000);
                } catch (Exception ex) {
                    // intentionally left blank
                }
            }
            request.setData("max retry:" + retry + ", retry: " + currentRetry + ", status:" + status + ", " + request.getData());
            repository.save(request);
            return status;
        }
        return HttpStatus.OK.value();
    }
}

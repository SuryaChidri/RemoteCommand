package com.example.com.remotecommand.service;

import com.example.com.remotecommand.controllers.IHistory;
import com.example.com.remotecommand.service.models.LockStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class HistoryImpl implements IHistory {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @RequestMapping(value = "/vehicle-lock-history/{VIN}", method = RequestMethod.GET)
    public LockStatus GetHistory(@PathVariable String VIN) {
        LockStatus lockStatus = restTemplate.getForObject("http://localhost:9101/api/v1/lockStatus/"+VIN,
                LockStatus.class);
        return lockStatus;
    }
}

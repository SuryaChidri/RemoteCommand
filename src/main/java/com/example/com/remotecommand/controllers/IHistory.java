package com.example.com.remotecommand.controllers;


import com.example.com.remotecommand.service.models.LockStatus;
import org.springframework.web.bind.annotation.PathVariable;


public interface IHistory {
    public LockStatus GetHistory(String VIN);


}

package com.mg.clientmg.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mg.clientmg.dto.InParam;
import com.mg.clientmg.dto.OutParam;
import com.mg.clientmg.service.TransferService;
import com.mg.mgclient.GetTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferControlle {

    @Autowired
    TransferService transferService;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    public TransferControlle(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping (path = "/gettransferinfo")
    public GetTransferResponse getInfo (@RequestBody String json) throws JsonProcessingException {
        System.out.println("in controller - "+json);
        InParam inParam = mapper.readValue(json, InParam.class);
        System.out.println("in controller - "+inParam.toString());
        return transferService.getOutParam(inParam);
    }

}

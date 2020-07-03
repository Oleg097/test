package com.mg.clientmg.service;


import com.mg.clientmg.GetTransferClient;
import com.mg.clientmg.dao.TransferDao;
import com.mg.clientmg.dto.InParam;
import com.mg.clientmg.dto.OutParam;
import com.mg.mgclient.GetTransfer;
import com.mg.mgclient.GetTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransferServiceImpl implements TransferService{

    @Autowired
    TransferDao transferDao;

    @Autowired
    GetTransferClient client;

    @Autowired
    public TransferServiceImpl(TransferDao transferDao) {
        this.transferDao = transferDao;
    }


    @Override
    public GetTransferResponse getOutParam(InParam inParam) {
        GetTransfer getTransfer = client.parceToGetTransfer(inParam);
        System.out.println(" in service GetTransfer -is -"+getTransfer.toString());
        System.out.println("in service transferDao.getTransferInfo(getTransfer) - is -"+transferDao.getTransferInfo(getTransfer));
        return transferDao.getTransferInfo(getTransfer);
    }
}

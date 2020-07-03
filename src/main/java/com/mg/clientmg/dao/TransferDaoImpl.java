package com.mg.clientmg.dao;


import com.mg.clientmg.GetTransferClient;
import com.mg.mgclient.GetTransfer;
import com.mg.mgclient.GetTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransferDaoImpl implements TransferDao{

    @Autowired
    GetTransferClient client;

    @Override
    public GetTransferResponse getTransferInfo(GetTransfer transfer) {
        System.out.println(" in daoimpl "+transfer);
        return client.getResponce(transfer);
    }
}

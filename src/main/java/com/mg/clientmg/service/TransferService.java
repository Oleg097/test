package com.mg.clientmg.service;

import com.mg.clientmg.dto.InParam;
import com.mg.clientmg.dto.OutParam;
import com.mg.mgclient.GetTransferResponse;

public interface TransferService {

    GetTransferResponse getOutParam (InParam inParam);

}

package com.mg.clientmg.dao;

import com.mg.mgclient.GetTransfer;
import com.mg.mgclient.GetTransferResponse;

public interface TransferDao {

    GetTransferResponse getTransferInfo (GetTransfer transfer);
}

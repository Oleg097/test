package com.mg.clientmg;

import com.mg.clientmg.dto.InParam;
import com.mg.clientmg.dto.OutParam;
import com.mg.mgclient.*;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class GetTransferClient extends WebServiceGatewaySupport {

    public GetTransferResponse getResponce (GetTransfer transfer){
        GetTransfer request = new GetTransfer();

        GetTransferResponse response = (GetTransferResponse)getWebServiceTemplate()
                .marshalSendAndReceive(request);
        return response;
    }

    public OutParam parceToOut (GetTransferResponse response){
        OutParam outParam = new OutParam();
        return outParam;
    }

    public GetTransfer parceToGetTransfer (InParam inParam ){
        GetTransfer getTransfer = new GetTransfer();

        Field transferNumber = new Field();
        transferNumber.setName("TransferNumber");
        transferNumber.setValue(inParam.getTransferValue());

        Field searchMode = new Field();
        searchMode.setName("TransferSearchMode");
        searchMode.setValue("0");

        ArrayOfField arrayOfField = new ArrayOfField();
        arrayOfField.getField().add(transferNumber);
        arrayOfField.getField().add(searchMode);

        RequestValues requestValues = new RequestValues();
        requestValues.setSystemId("MG");
        requestValues.setLanguage("en");
        requestValues.setLoginType(1);
        requestValues.setPointCode(inParam.getPointCode());
        requestValues.setUserLogin("clerk_ukrpost");
        requestValues.setUserPassword("123123");

        requestValues.setArgs(arrayOfField);


        return getTransfer;
    }




}

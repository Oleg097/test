package com.mg.clientmg.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class InParam {

    private String pointCode;

    private String transferValue;

    public InParam() {
    }

    public InParam(String pointCode, String transferValue) {
        this.pointCode = pointCode;
        this.transferValue = transferValue;
    }

    public String getPointCode() {
        return pointCode;
    }

    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    public String getTransferValue() {
        return transferValue;
    }

    public void setTransferValue(String transferValue) {
        this.transferValue = transferValue;
    }
}

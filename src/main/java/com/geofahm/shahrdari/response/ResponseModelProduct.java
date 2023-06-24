package com.geofahm.shahrdari.response;


import org.springframework.data.domain.Page;

import java.util.List;

public class ResponseModelProduct <T> {
    private int responseCode;
    private String responseMessage;
    private Page data;

    public ResponseModelProduct() {
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Page<T> getData() {
        return data;
    }

    public void setData(Page<T> data) {
        this.data = data;
    }
}

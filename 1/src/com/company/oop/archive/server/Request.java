package com.company.oop.archive.server;

import com.company.oop.archive.common.RequestType;

import java.util.List;

public class Request {

    private RequestType requestType;
    private List<String> parameters;

    public Request(RequestType requestType, List<String> parameters) {
        this.requestType = requestType;
        this.parameters = parameters;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }
}

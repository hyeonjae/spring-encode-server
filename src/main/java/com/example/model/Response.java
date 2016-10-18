package com.example.model;

import java.nio.charset.StandardCharsets;

public class Response {
    String result;

    public Response() {
    }

    public Response(String result) {
        this.result = result;
    }

    public Response(byte[] bytes) {
        this(new String(bytes, StandardCharsets.UTF_8));
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

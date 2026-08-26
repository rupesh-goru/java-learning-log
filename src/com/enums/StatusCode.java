package com.enums;

public enum StatusCode {
    NOTFOUND(404),
    SUCCESS(200),
    BAD_REQUEST(400),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501);

    int code;
    StatusCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}

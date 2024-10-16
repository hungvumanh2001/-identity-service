package com.example.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXITED(1002, "Username already exists"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    PASSSWORD_INVALID(1004, "Password must be at least 6 characters"),
    USER_NOT_EXITED(1005, "Username not existed"),
    UNAUTHENTICATED(1006, "Unauthencated")
    ;

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

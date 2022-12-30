package com.basf.challenge.contants;

public enum ResponseConstants {
    /**
     * @OK Custom OK Responses
     */
    OK("OK", "All good"),

    /**
     * @ERROR Custom error for responses
     */
    ERROR_404("NOT_FOUND", "This content doesn't exist in this path."),
    ERROR_500("GATEWAY_ERROR", "Something was wrong.");

    private final String status;
    private final String message;

    ResponseConstants(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}

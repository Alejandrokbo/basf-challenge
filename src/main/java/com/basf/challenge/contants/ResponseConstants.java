package com.basf.challenge.contants;

public enum ResponseConstants {
    /**
     * @OK Custom OK Responses
     */
    OK("OK", "All good"),

    /**
     * @ERROR Custom error for responses
     */
    E404("NOT_FOUND", "This content doesn't exist in this path."),
    E500("GATEWAY_ERROR", "Something was wrong."),
    EF01("NOT_FILE", "Please select a file to upload.");

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

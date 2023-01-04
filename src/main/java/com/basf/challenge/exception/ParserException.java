package com.basf.challenge.exception;

public final class ParserException extends Exception {
    public ParserException() {
        super();
    }

    public ParserException(String where, Exception e) {
        super("Error en Parseo, metodo: " + where + " Excepcion: " + e.getMessage());
    }

    public ParserException(String where, String message) {
        super("Error en Parseo, metodo: " + where + " Excepcion: " + message);
    }

    public ParserException(String User, String Robot, String where, Exception e) {
        super("Error en Parseo, metodo: " + where + " Excepcion: " + e.getMessage());
    }

    public String getExceptionCode() {
        return "PARSING_ERROR";
    }
}

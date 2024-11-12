package br.tech.tickets.exception;

public class ShowNotFoundException extends RuntimeException {

    private final int errorCode;

    public ShowNotFoundException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

package com.vattima.lego.fulfillment.exception;

public class FulfillmentException extends RuntimeException {
    public FulfillmentException() {
    }

    public FulfillmentException(String message) {
        super(message);
    }

    public FulfillmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public FulfillmentException(Throwable cause) {
        super(cause);
    }

    public FulfillmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.example.datanor.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<Object> handleError(ApplicationException e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()), new HttpHeaders(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<Object> handleError(ObjectNotFoundException e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()), new HttpHeaders(),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InternalException.class)
    public ResponseEntity<Object> handleError(InternalException e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()), new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleError(Exception e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()), new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

}


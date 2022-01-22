package me.benhunter.springcontrolleradviceexample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advice {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> handleBadRequest(BadRequestException badRequestException) {
        return ResponseEntity.badRequest().body("Bad bad bad");

        // Alternate way to create a ResponseEntity:
        // return new ResponseEntity<>("Bad bad bad", HttpStatus.BAD_REQUEST);
    }
}

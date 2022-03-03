package com.orders.management.exception;



import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling  {
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handle1(NullPointerException message){
		return new ResponseEntity<String>(message.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> handle2(EmptyResultDataAccessException empty){
		return new ResponseEntity<String>(empty.getMessage(),HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> handle3(EntityNotFoundException ent){
		return new ResponseEntity<String>("Entity not found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handle4(NoSuchElementException n){
		return new ResponseEntity<String>(n.getMessage(),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handle4(Exception  e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}

}

package com.company;

public class ProductAlreadyRegisteredException extends Exception {
	public ProductAlreadyRegisteredException(final String message){
		super(message);
	}
	
	@Override
	public String getMessage(){
		return super.getMessage();
	}
}

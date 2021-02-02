package com.example.demo.custException;

@SuppressWarnings("serial")
public class NotFound extends RuntimeException{

	public NotFound(String msg) {
		super(msg);
	}
}

package com.example.demo1;

public class ResponseMessage {
 private String response;

 
public ResponseMessage() {
	super();
	// TODO Auto-generated constructor stub
}

public ResponseMessage(String response) {
	super();
	this.response = response;
}

public String getResponse() {
	return response;
}

public void setResponse(String response) {
	this.response = response;
}

@Override
public String toString() {
	return " [response : " + response + "]";
}
 
}

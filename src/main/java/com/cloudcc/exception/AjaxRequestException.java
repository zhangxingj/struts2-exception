package com.cloudcc.exception;

public class AjaxRequestException extends BaseException {

	private static final long serialVersionUID = 1L;

	public AjaxRequestException(String code, String msg) {
		super(code, msg);
		// TODO Auto-generated constructor stub
	}
	
	public AjaxRequestException(String code,String msg,Exception innerException){
		super(code, msg, innerException);
	}

}

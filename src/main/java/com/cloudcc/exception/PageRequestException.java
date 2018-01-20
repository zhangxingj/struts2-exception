package com.cloudcc.exception;

public class PageRequestException extends BaseException {

	private static final long serialVersionUID = 1L;

	public PageRequestException(String code, String msg,
			Exception innerException) {
		super(code, msg, innerException);
		// TODO Auto-generated constructor stub
	}

	public PageRequestException(String code, String msg) {
		super(code, msg);
		// TODO Auto-generated constructor stub
	}

}

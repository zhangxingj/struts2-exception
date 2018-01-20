/**
 * 
 */
package com.cloudcc.exception;

/**
 * @author dev06
 *
 */
public class BaseException extends Exception {

	private static final long serialVersionUID = 1L;

	private String code;
	private String msg;
	private Exception innerException;
	
	public BaseException(String code,String msg,Exception innerException){
		this.code = code;
		this.msg = msg;
		this.innerException = innerException;
	}
	
	public BaseException(String code,String msg){
		this.code = code;
		this.msg = msg;
		this.innerException = this;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Exception getInnerException() {
		return innerException;
	}

	public void setInnerException(Exception innerException) {
		this.innerException = innerException;
	}

}

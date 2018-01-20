package com.cloudcc.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionProviderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String execute(){
		if("".equals(method)){
			return "";
		}else{
			return "";
		}
		
	}
	
	
	private String method;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}

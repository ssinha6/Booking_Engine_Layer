package com.cognizant.orchestration.dto;

import java.io.Serializable;

import com.cognizant.orchestration.common.dto.ResponseMessageType;

public class DeviceInformationRS implements Serializable{

	private static final long serialVersionUID = -7606056112567198976L;
	private ResponseMessageType responseType;
	private String responseMessage;

	public ResponseMessageType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseMessageType responseType) {
		this.responseType = responseType;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}

package com.jsp.jst_ticket_booking_spring_boot.response;

import lombok.Data; 
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseStructure<T> {

    public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessgae() {
		return messgae;
	}
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	private int statusCode;
    private String messgae;
    private T data;


}

package com.homeAss.utils;

import org.springframework.http.HttpStatus;

public class AjaxResponse {

	private HttpStatus status;
	private Object data;
	private Object optional;
	private int recordsTotal;
	private int recordsFiltered;
	private int draw;

	public String getStatus() {
		return status.name();
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getOptional() {
		return optional;
	}

	public void setOptional(Object optional) {
		this.optional = optional;
	}

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

}
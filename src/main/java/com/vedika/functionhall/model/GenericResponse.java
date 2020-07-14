package com.vedika.functionhall.model;

public class GenericResponse<ResponseData> {

	private ResponseData data;

	public ResponseData getData() {
		return data;
	}

	public void setData(ResponseData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericResponse [data=" + data + "]";
	}

	
}

package com.spesa.pojo.DTO;

import java.util.List;


public class CodeGeneratorDTO {

	List<FieldDTO> fieldList;
	private String title;

	public List<FieldDTO> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<FieldDTO> fieldList) {
		this.fieldList = fieldList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

package com.proyecto.bootcamp.bean;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


public class Students implements Serializable{


	@ApiModelProperty(notes = "Id is important", dataType = "String")
     private  String _id;
	
	
	@ApiModelProperty(notes = "Complement Name is important" , dataType = "String")
	@NotNull(message = "Complement Name is important")
	 private String complementName;
	

	@ApiModelProperty(notes = "Nombres debe tener minimo 3 caracteres" , dataType = "String")
    @NotNull(message = "It is important")
	private String sex;
	
	
	@ApiModelProperty(notes = "Date Birth is important" , dataType = "String")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateBirth;
	

	@ApiModelProperty(notes = "Type identify is important" , dataType = "String")
	@NotNull(message = "Type of identity is important")
	private String typeidentify;
	
	
	
	@ApiModelProperty(notes = "Number identify", dataType = "int")
	@Min(1)
    @Max(10)
	private int  numberidentify;


	
	
	

	
	
	

	public String get_id() {
		return _id;
	}



	public void set_id(String _id) {
		this._id = _id;
	}



	public String getComplementName() {
		return complementName;
	}



	public void setComplementName(String complementName) {
		this.complementName = complementName;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public Date getDateBirth() {
		return dateBirth;
	}



	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}



	public String getTypeidentify() {
		return typeidentify;
	}



	public void setTypeidentify(String typeidentify) {
		this.typeidentify = typeidentify;
	}



	public int getNumberidentify() {
		return numberidentify;
	}



	public void setNumberidentify(int numberidentify) {
		this.numberidentify = numberidentify;
	}



	
	

	
	
}

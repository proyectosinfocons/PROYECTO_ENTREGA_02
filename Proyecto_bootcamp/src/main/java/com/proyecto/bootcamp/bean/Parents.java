package com.proyecto.bootcamp.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@ApiModel(description = "IMFORMATION PARENTS")
@Document(collection = "Parents")
public class Parents {
	
	
	@ApiModelProperty(notes = "Id is important", dataType = "String")
	@Id
     private  String _id;
	
	
	@ApiModelProperty(notes = "Complement Name is important" , dataType = "String")
	@NotNull(message = "Complement Name is important")
	 private String complementName;
	

	@ApiModelProperty(notes = "Nombres debe tener minimo 3 caracteres" , dataType = "String")
    @NotNull(message = "It is important")
	private String sex;
	
	
	@ApiModelProperty(notes = "Date Birth is important" , dataType = "String")
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso =  ISO.DATE)
	private Date dateBirth;
	

	@ApiModelProperty(notes = "Type identify is important" , dataType = "String")
	@NotNull(message = "Type of identity is important")
	private String typeidentify;
	
	
	
	@ApiModelProperty(notes = "Number identify", dataType = "String")
	@Min(1)
    @Max(10)
	private String  numberidentify;

     private Students student;
     
     
     
     
     
      
	public Students getStudent() {
		return student;
	}



	public void setStudent(Students student) {
		
		
	
		
		this.student = student;
	}



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



	public String getNumberidentify() {
		return numberidentify;
	}



	public void setNumberidentify(String numberidentify) {
		this.numberidentify = numberidentify;
	}



	


	
	

	
	
}

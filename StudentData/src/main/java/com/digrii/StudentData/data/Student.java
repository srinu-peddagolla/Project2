package com.digrii.StudentData.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTINFO")
public class Student {
	
	@Id
	@Column(name="STUDENTID")
	private Integer studentId;
	
	@Column(name="STUDENTNAME")
	private String studentName;
	
	@Column(name="MOBILE")
	private String mobile;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

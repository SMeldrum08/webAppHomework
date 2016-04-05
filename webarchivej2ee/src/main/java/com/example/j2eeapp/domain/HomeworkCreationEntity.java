package com.example.j2eeapp.domain;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.example.j2eeapp.commons.domain.BaseEntity;


@Entity
@Table(name="apphomeworkcreation")
public class HomeworkCreationEntity extends BaseEntity{
	
	
	private static final long serialVersionUID = -8611458117450360868L;
	
	/**
	 * 
	 *  
	 * 
	 */
	
	
	
	private String teacherId;
	private String classId;
	private String homework;
	private String dateSet;
	private String dateDue;
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getHomework() {
		return homework;
	}
	public void setHomework(String homework) {
		this.homework = homework;
	}
	public String getDateSet() {
		return dateSet;
	}
	public void setDateSet(String dateSet) {
		this.dateSet = dateSet;
	}
	public String getDateDue() {
		return dateDue;
	}
	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}
	
	
}

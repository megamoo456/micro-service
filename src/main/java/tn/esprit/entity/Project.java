package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -797923168679747618L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Project(int id, String name, String type, String descreption, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.descreption = descreption;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Project() {
		super();
	}
	
	public Project(String name) {
		super();
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name="type")
	private String type;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(name="descreption")
	private String descreption;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal (TemporalType.DATE)
	private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal (TemporalType.DATE)
	private Date endDate;
	
	@Column(name="duration")
	private int duration;

}

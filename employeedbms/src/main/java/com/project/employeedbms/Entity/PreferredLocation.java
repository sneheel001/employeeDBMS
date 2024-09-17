package com.project.employeedbms.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PreferredLocation")
public class PreferredLocation {
	
	@Id
	@JsonIgnore
	private int empId;
	
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name="Emp_Id")
	private Employee employee;
	
	private String location;

}

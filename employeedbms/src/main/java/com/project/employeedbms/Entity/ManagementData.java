package com.project.employeedbms.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="ManagementData")
public class ManagementData {
	
	@Id
	private int employeeId;	
	
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name="Employee_Id")
	@JsonIdentityReference(alwaysAsId=true)
	private Employee employee;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="Manager_Id")
	private ManagerDetails managerDetails;

}

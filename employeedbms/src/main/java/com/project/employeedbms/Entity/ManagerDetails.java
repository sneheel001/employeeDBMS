package com.project.employeedbms.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "ManagerDetails")
public class ManagerDetails {

	@Id
	private int managerId;

	@OneToOne
	@MapsId
	@JoinColumn(name = "Manager_Id")
	@JsonBackReference
	private Employee employee;

}

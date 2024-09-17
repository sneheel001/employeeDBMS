package com.project.employeedbms.Entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="Employee_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	
	@Column(name="Name",unique=true)
	@NotBlank(message="Field cannot be blank")
	private String name;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="DOB")
	private LocalDate dateOfBirth;
	
	@Column(name="Contact_N0")
	private long contactNo;
	
	@Column(name="Email_Id")
	@Email(message="Enter a valid Email Address")
	@NotBlank(message="Field cannot be blank")
	private String emailId;
	
	@Column(name="Password")
	@NotBlank(message="Field Cannot be blank")
	private String password;
	
	@Column(name="Role")
	@NotBlank(message="Field cannot be blank")
	private String role;

	//getter and setter for employeeId
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	
	// Getter and Setter for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for 'role'
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}

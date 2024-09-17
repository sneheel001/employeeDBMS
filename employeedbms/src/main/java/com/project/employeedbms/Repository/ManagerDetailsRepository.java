package com.project.employeedbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employeedbms.Entity.ManagerDetails;

@Repository
public interface ManagerDetailsRepository extends JpaRepository<ManagerDetails, Integer> {
	

}

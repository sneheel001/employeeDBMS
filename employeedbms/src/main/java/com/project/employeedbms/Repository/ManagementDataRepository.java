package com.project.employeedbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employeedbms.Entity.ManagementData;

@Repository
public interface ManagementDataRepository extends JpaRepository<ManagementData, Integer> {

}

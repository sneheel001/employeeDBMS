package com.project.employeedbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employeedbms.Entity.Location;

@Repository
public interface WorkLocationRepository extends JpaRepository<Location, Integer>{

}

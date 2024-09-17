package com.project.employeedbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employeedbms.Entity.PreferredLocation;

@Repository
public interface LocationRepository extends JpaRepository<PreferredLocation, Integer> {

}

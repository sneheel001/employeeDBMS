package com.project.employeedbms.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.employeedbms.Entity.Employee;
import com.project.employeedbms.Repository.EmployeeRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public UserDetails loadUserByUsername(String employeeId) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employee> employee=employeeRepository.findById(Integer.parseInt(employeeId));
		if(!employee.isPresent())
		{
			throw new UsernameNotFoundException("User not found!!!!!!");
		}
		
		List<GrantedAuthority> authorities=List.of(new SimpleGrantedAuthority("ROLE_"+employee.get().getRole()));
		return new User(String.valueOf(employee.get().getEmployeeId()),employee.get().getPassword(),authorities);
		
	}

}

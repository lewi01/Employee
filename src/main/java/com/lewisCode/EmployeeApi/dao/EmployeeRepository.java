package com.lewisCode.EmployeeApi.dao;

import com.lewisCode.EmployeeApi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
     List<Employee> findAllByOrderByLastNameAsc();
}

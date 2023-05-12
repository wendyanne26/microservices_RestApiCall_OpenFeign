package com.wendy.openFeignemployeeservice.repository;

import com.wendy.openFeignemployeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

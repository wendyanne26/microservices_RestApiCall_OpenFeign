package com.wendy.openFeigndepartmentservice.repositories;


import com.wendy.openFeigndepartmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentCode(String departmentCode);

}

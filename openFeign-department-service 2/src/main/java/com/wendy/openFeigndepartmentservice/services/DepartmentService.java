package com.wendy.openFeigndepartmentservice.services;

import com.wendy.openFeigndepartmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}

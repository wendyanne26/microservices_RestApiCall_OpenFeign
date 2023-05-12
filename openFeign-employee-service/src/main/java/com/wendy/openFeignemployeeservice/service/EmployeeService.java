package com.wendy.openFeignemployeeservice.service;

import com.wendy.openFeignemployeeservice.dto.ApiResponseDto;
import com.wendy.openFeignemployeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long id);
}

package com.javaDemo.javaDemo.dao;

import com.javaDemo.javaDemo.entity.Employees;
import sun.jvm.hotspot.debugger.Page;

public interface BatchJobExecutionRepositoryCustom {
    Page<Employees> findAllEmployee(Integer page, Integer size);
}

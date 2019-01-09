package com.javaDemo.javaDemo.dao;


import com.javaDemo.javaDemo.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.debugger.Page;

import javax.management.Query;
import javax.persistence.EntityManager;

@Repository
public class BatchJobExecutionRepositoryImpl {

    @Autowired
    private EntityManager em;

    public Page<Employees> findAllEmployee(Integer page, Integer size){
        String rootQuery = "SELECT * FROM Employees";

        Query q = em.createNativeQuery();
    }

    private String queryCriteriaBuilder(String query){
        StringBuilder buildQuery = new StringBuilder();
        buildQuery.append(Query);
        boolean flag = true;
//        buildQuery.append()
    }
}

package com.example.CRUD_BE_MDB.Repository;

import com.example.CRUD_BE_MDB.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // Custom query methods can be defined here
}
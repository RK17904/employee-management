package com.example.CRUD_BE_MDB;

import com.example.CRUD_BE_MDB.Model.Employee;
import com.example.CRUD_BE_MDB.Repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudBeMdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudBeMdbApplication.class, args);
    }
}
package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
	Optional<Employee> findOneByEmailAndPassword(String email, String password);
	Employee findByEmail(String email);
}
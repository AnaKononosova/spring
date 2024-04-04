package com.cydeo.entity;

import com.cydeo.enums.Gender;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private BigDecimal employeeId;
  private String firstName;
  private String lastName;
  private String email;
  private LocalDate hireDate;
  private Department department;
  private Gender gender;
  private int salary;
  private String regionId;

}

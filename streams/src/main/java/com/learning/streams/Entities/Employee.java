package com.learning.streams.Entities;

import com.learning.streams.Enums.Gender;
import com.learning.streams.Enums.Level;

public class Employee {
    private String empName;
    private String empState;
    private Gender empGender;
    private Level empLevel;
    private Float empSalary;

    public Employee(String empName, String empState, Gender empGender, Level empLevel, Float empSalary) {
        this.empName = empName;
        this.empState = empState;
        this.empGender = empGender;
        this.empLevel = empLevel;
        this.empSalary = empSalary;
    }
    
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpState() {
        return empState;
    }
    public void setEmpState(String empState) {
        this.empState = empState;
    }
    public Gender getEmpGender() {
        return empGender;
    }
    public void setEmpGender(Gender empGender) {
        this.empGender = empGender;
    }
    public Level getEmpLevel() {
        return empLevel;
    }
    public void setEmpLevel(Level empLevel) {
        this.empLevel = empLevel;
    }
    public Float getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee [empGender=" + empGender + ", empLevel=" + empLevel + ", empName=" + empName + ", empSalary="
                + empSalary + ", empState=" + empState + "]";
    }
}

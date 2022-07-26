package com.learning.oops.Inheritance;

/**
 * Inheritance enhance the code reuseability across package in java, As a thumb rule, variable are private, methods are public.
 * Java support -> Single, Multilevel, hierarchical.
 * Due to diamond problem, the java can't implement multiple and hybrid inheritance.
 * But they are possible by implementing interface and extending a super class at a same time.  
 */


public class Employee {
    private String empName;
    private float empSalary=40000; 
    private String empLevel;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public float getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
    public String getEmpLevel() {
        return empLevel;
    }
    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }
}

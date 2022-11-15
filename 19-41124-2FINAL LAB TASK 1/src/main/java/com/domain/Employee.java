package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Employee {


    int id;

    String firstname;
    String lastname;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String firstname,String lastname,, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getFirstnameName()
    {
        return firstname;
    }

    public String getLastName()
    {
        return lastname;
    }


    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }



    List<Employee> employeeList = new ArrayList<Employee>();



}


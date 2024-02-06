package com.dgsoft.stream.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeLoader.loadEmployeeList();

        //sorted in reverse depending on salary
        employeeList.stream().map(e -> e.getSalary())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //getting 3rd highest salary
        Double hSalary = employeeList.stream().map(e -> e.getSalary())
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst().get();

        System.out.println("3rd Highest salary"+hSalary);
    }



















}

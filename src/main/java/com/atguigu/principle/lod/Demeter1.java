package com.atguigu.principle.lod;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

/**
 * 学校总部员工
 */
class Employee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

/**
 * 学院员工类
 */
class CollegeEmployee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

class CollegeManager {

    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工的 id = " + i);
            list.add(collegeEmployee);
        }
        return list;
    }

}

/*
CollegeEmployee 不是 SchoolManager 的直接朋友
CollegeEmployee 以局部变量的方式出现在 SchoolManager
 */
class SchoolManager {

    public List<Employee> getAllEmployee() {
        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学院总部员工 id = " + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------学院员工----------");
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println(collegeEmployee.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------学校总部员工----------");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }

}
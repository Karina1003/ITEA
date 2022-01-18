package com.karinapinchuk.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Positions> positionsList = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Positions> getPositionsList() {
        return positionsList;
    }

    public class Positions {
        private String positionName;
        private List<Employee> employeesList = new ArrayList<>();

        public Positions(String positionName) {
            this.positionName = positionName;
            positionsList.add(Positions.this);
        }

        public String getPositionName() {
            return positionName;
        }

        public List<Employee> getEmployeesList() {
            return employeesList;
        }

        public class Employee {
            private String name;
            private String surname;
            private boolean isWorking;

            public Employee(String name, String surname, boolean isWorking) {
                this.name = name;
                this.surname = surname;
                this.isWorking = isWorking;
                employeesList.add(Employee.this);
            }

            @Override
            public String toString() {
                return "Employee " + name + ' ' + surname +
                       ". Is still working on this position - " + isWorking;
            }
        }

        @Override
        public String toString() {
            StringBuilder employeeStr = new StringBuilder("");
            for (Department.Positions.Employee employee:employeesList) {
                employeeStr.append("   "+employee).append('\n');
            }
            return "Position: " + positionName + "\n" +
                    "   Employees: " + "\n" +
                    employeeStr.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder positionsStr = new StringBuilder("");
        for (Positions position:positionsList) {
            positionsStr.append(" "+position).append('\n');
        }
        return "Department: " + departmentName + "\n" +
                positionsStr.toString();
    }
}

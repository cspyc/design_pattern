package cn.pyc.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pi
 * @date 2021/07/03 19:08:08
 **/
@SuppressWarnings({"all"})
public class Demeter {
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
 * 学院员工
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


/**
 * 学院管理类
 */
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id = " + i);
            collegeEmployees.add(employee);
        }
        return collegeEmployees;
    }
}

/**
 * 学校管理
 */
class SchoolManager {
    public List<Employee> getAllEmployee() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校员工 id = " + i);
            employees.add(employee);
        }
        return employees;
    }

    //输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager e) {

        //CollegeEmployee不是SchoolManager的直接朋友
        //CollegeEmployee是以局部变量方式出现在SchoolManager内的
        List<CollegeEmployee> collegeEmployeeList = e.getAllEmployee();
        System.out.println("--------------学院员工-------------");
        for (CollegeEmployee employee : collegeEmployeeList) {
            System.out.println(employee.getId());
        }

        List<Employee> employeeList = this.getAllEmployee();
        System.out.println("-----------学校总部员工-------------");
        for (Employee employee : employeeList) {
            System.out.println(employee.getId());
        }
    }
}
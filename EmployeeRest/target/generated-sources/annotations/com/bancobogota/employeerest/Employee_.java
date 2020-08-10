package com.bancobogota.employeerest;

import com.bancobogota.employeerest.Employee;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T18:53:27")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Long> empId;
    public static volatile SingularAttribute<Employee, String> empName;
    public static volatile SingularAttribute<Employee, BigInteger> empSalary;
    public static volatile CollectionAttribute<Employee, Employee> employeeCollection;
    public static volatile SingularAttribute<Employee, String> empFunction;
    public static volatile SingularAttribute<Employee, Employee> empBossId;
    public static volatile SingularAttribute<Employee, Date> empDateAdmission;

}
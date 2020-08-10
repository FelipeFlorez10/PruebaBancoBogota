/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancobogota.employeerest;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Desarrollo
 */
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEmpId", query = "SELECT e FROM Employee e WHERE e.empId = :empId"),
    @NamedQuery(name = "Employee.findByEmpName", query = "SELECT e FROM Employee e WHERE e.empName = :empName"),
    @NamedQuery(name = "Employee.findByEmpFunction", query = "SELECT e FROM Employee e WHERE e.empFunction = :empFunction"),
    @NamedQuery(name = "Employee.findByEmpDateAdmission", query = "SELECT e FROM Employee e WHERE e.empDateAdmission = :empDateAdmission"),
    @NamedQuery(name = "Employee.findByEmpSalary", query = "SELECT e FROM Employee e WHERE e.empSalary = :empSalary")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_id")
    private Long empId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "emp_name")
    private String empName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "emp_function")
    private String empFunction;
    @Column(name = "emp_date_admission")
    @Temporal(TemporalType.DATE)
    private Date empDateAdmission;
    @Column(name = "emp_salary")
    private BigInteger empSalary;
    @OneToMany(mappedBy = "empBossId")
    private Collection<Employee> employeeCollection;
    @JoinColumn(name = "emp_boss_id", referencedColumnName = "emp_id")
    @ManyToOne
    private Employee empBossId;

    public Employee() {
    }

    public Employee(Long empId) {
        this.empId = empId;
    }

    public Employee(Long empId, String empName, String empFunction) {
        this.empId = empId;
        this.empName = empName;
        this.empFunction = empFunction;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpFunction() {
        return empFunction;
    }

    public void setEmpFunction(String empFunction) {
        this.empFunction = empFunction;
    }

    public Date getEmpDateAdmission() {
        return empDateAdmission;
    }

    public void setEmpDateAdmission(Date empDateAdmission) {
        this.empDateAdmission = empDateAdmission;
    }

    public BigInteger getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(BigInteger empSalary) {
        this.empSalary = empSalary;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    public Employee getEmpBossId() {
        return empBossId;
    }

    public void setEmpBossId(Employee empBossId) {
        this.empBossId = empBossId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bancobogota.employeerest.Employee[ empId=" + empId + " ]";
    }
    
}

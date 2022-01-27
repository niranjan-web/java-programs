package com.hibernate.HibernateMappingDemo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    
    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "employee_name")
    private String employeeName;

    //@OneToMany(mappedBy ="project" ,cascade = CascadeType.ALL)
    @ManyToMany(mappedBy = "employee")
    List<ProjectEntity> project;
    public List<ProjectEntity> getProject() {
        return project;
    }

    public void setProject(List<ProjectEntity> project) {
        this.project = project;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeEntity(int employeeId, String employeeName) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public EmployeeEntity() {
        super();
    }

    @Override
    public String toString() {
        return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
    }

}

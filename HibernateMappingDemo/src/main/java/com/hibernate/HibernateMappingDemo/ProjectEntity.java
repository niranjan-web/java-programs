package com.hibernate.HibernateMappingDemo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @Column(name = "project_id")
    private int projectId;
    @Column(name = "project_name")
    private String projectName;
    
    @ManyToMany
    List<EmployeeEntity> employee;

    public List<EmployeeEntity> getEmployee() {
        return employee;
    }

    public void setEmployee(List<EmployeeEntity> employee) {
        this.employee = employee;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectEntity(int projectId, String projectName) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public ProjectEntity() {
        super();
    }

    @Override
    public String toString() {
        return "ProjectEntity [projectId=" + projectId + ", projectName=" + projectName + "]";
    }

}

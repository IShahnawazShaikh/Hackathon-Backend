package com.btalent.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="employee")
public class EmployeeEntity {

    @Id
    @Column(name="emp_id")
    private String empId;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="is_trainee")
    private Boolean isTrainee;

    @Column(name="link")
    private String trainingSheetLink;

}

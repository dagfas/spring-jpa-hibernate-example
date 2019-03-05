package com.example.springjpahibernateexample.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "test")
//We are saying the tables name is users and the database is test
//In this case we are using SQL so it will connect to that
public class Users {

    //Id is a unique identifier
    //We don't have to explicitly specify column names but we can do that if we want them to be named something else
    //Look example below (Even though in this case we haven't changed anything)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    private Integer salary;
    private String teamName;

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}

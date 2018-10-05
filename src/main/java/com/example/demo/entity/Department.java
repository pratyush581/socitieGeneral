package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;

/**
 * @author Pratyush.
 */
@Entity
public class Department {
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer deptId;
    @Column(name = "DEPT_NAME")                                       private String deptName;
    @JoinColumn(name = "DEPT_ID")  @OneToMany(fetch = FetchType.LAZY) private List<User> users;
	
    
    
    
    public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
    
    
    public Department() {
		super();
	}
    
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
    
   

    
}

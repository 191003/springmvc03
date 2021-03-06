package com.zking.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Role {
    private Long roleId;

    private String roleName;

    private Integer available;

    private String description;

    private List<User> users=new ArrayList<User>();



    public Role(Long roleId, String roleName, Integer available, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.available = available;
        this.description = description;
    }

    public Role() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {

        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
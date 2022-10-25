package edu.miu.cs.cs425.eregistrarapp.service;

import edu.miu.cs.cs425.eregistrarapp.model.Role;

import java.util.List;

public interface RoleService {

    public List<Role> getAllRoles();
    public Role findByName(String name);

}

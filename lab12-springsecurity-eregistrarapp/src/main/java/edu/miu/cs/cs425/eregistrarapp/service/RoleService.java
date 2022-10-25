package edu.miu.cs.cs425.eregistrarapp.service;

import edu.miu.cs.cs425.eregistrarapp.model.Role;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface RoleService {

    public abstract List<Role> getAllRoles();
    public Role addNewRole(Role role);

}

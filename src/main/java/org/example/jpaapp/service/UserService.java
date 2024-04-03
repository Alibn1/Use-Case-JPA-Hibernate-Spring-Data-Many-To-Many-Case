package org.example.jpaapp.service;

import org.example.jpaapp.entities.Role;
import org.example.jpaapp.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String rolename);
    User authenticate(String userName, String password);
}

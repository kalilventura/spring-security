package br.com.github.kalilventura.security.service;

import br.com.github.kalilventura.security.domain.Role;
import br.com.github.kalilventura.security.domain.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}

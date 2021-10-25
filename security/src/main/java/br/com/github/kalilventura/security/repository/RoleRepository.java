package br.com.github.kalilventura.security.repository;

import br.com.github.kalilventura.security.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

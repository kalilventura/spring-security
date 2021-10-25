package br.com.github.kalilventura.security.repository;

import br.com.github.kalilventura.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

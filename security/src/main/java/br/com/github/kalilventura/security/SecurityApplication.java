package br.com.github.kalilventura.security;

import br.com.github.kalilventura.security.domain.Role;
import br.com.github.kalilventura.security.domain.User;
import br.com.github.kalilventura.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "John", "john", "1234", new ArrayList<Role>()));
            userService.saveUser(new User(null, "Locke", "locke", "4321", new ArrayList<Role>()));

            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("locke", "ROLE_SUPER_ADMIN");
        };
    }
}

package edu.miu.cs.cs425.eregistrarapp;

import edu.miu.cs.cs425.eregistrarapp.model.Role;
import edu.miu.cs.cs425.eregistrarapp.model.User;
import edu.miu.cs.cs425.eregistrarapp.repository.RoleRepository;
import edu.miu.cs.cs425.eregistrarapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lab12SpringsecurityJwtEregistrarappApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
//    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void initAdminUser() {
        var adminUser = userRepository.findByUsername("admin");
        if(adminUser.isEmpty()) {
            List<Role> listAdminRoles = new ArrayList<>();
            var adminRole = roleRepository.findByRole("ROLE_ADMIN");
            if(adminRole.isEmpty()) {
                var newAdminRole = new Role(null, "ROLE_ADMIN");
                listAdminRoles.add(newAdminRole);
            }
            else {
                listAdminRoles.add(adminRole.get());
            }

            User newAdminUser = new User(null, "Admin", "Admin","Admin", "rediet@gmail.com", passwordEncoder.encode("test1234"),"rediet@gmail.com",
                    listAdminRoles);
            newAdminUser.setRoles(listAdminRoles);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Lab12SpringsecurityJwtEregistrarappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

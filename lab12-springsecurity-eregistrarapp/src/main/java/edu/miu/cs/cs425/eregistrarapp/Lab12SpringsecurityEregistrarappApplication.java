package edu.miu.cs.cs425.eregistrarapp;

import edu.miu.cs.cs425.eregistrarapp.model.Role;
import edu.miu.cs.cs425.eregistrarapp.model.Student;
import edu.miu.cs.cs425.eregistrarapp.model.User;
import edu.miu.cs.cs425.eregistrarapp.repository.RoleRepository;
import edu.miu.cs.cs425.eregistrarapp.repository.UserRepository;
import edu.miu.cs.cs425.eregistrarapp.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lab12SpringsecurityEregistrarappApplication implements CommandLineRunner {

    private StudentService studentService;
    private RoleRepository roleRepository;
    private UserRepository userRepository;

    public Lab12SpringsecurityEregistrarappApplication(StudentService studentService, RoleRepository roleRepository, UserRepository userRepository) {
        this.studentService = studentService;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Lab12SpringsecurityEregistrarappApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        LocalDate d1 = LocalDate.of(2020, 1, 8);
        LocalDate d2 = LocalDate.of(2022, 1, 8);
        Student s1 = new Student(null, "000-61-0001", "Anna", "w", "Smith", 3.65, d1, "yes");
        Student s2 = new Student(null, "000-61-0002", "Redi", "m", "Wold", 3.65, d1, "no");
        Student s3 = new Student(null, "000-61-0002", "Dagi", "m", "Mulu", 3.65, d1, "no");
        Student s4 = new Student(null, "000-61-0002", "Mesi", "m", "Wold", 3.45, d1, "no");
        Student s5 = new Student(null, "000-61-0002", "Betty", "m", "Yihe", 3.65, d1, "no");
        Student s6 = new Student(null, "000-61-0002", "Dani", "m", "Bogale", 3.35, d1, "no");
        Student s7 = new Student(null, "000-61-0007", "Mekdi", "a", "aina", 3.65, d1, "no");
        Student s8 = new Student(null, "000-61-0008", "Mahilet", "m", "Amde", 3.65, d1, "no");
        Student s9 = new Student(null, "000-61-0009", "Gano", "m", "Gano", 3.65, d1, "no");
        Student s10 = new Student(null, "000-61-00010", "Luis", "v", "Djsus", 3.8, d1, "no");
        Student s11 = new Student(null, "000-61-00011", "Paval", "m", "Jhon", 3.6, d1, "Yess");
        Student s12 = new Student(null, "000-61-00012", "Tekeste", "y", "Ayele", 3.8, d1, "no");
        Student s13 = new Student(null, "000-61-00014", "Rufail", "z", "Goytom", 3.65, d1, "no");
        Student s14 = new Student(null, "000-61-00015", "Senait", "k", "Gezahegn", 3.9, d1, "no");
        Student s15 = new Student(null, "000-61-0007", "Muluneh", "y", "Woldemariam", 4.00, d1, "yes");

        studentService.addStudent(s1);
        studentService.addStudent(s2);
        studentService.addStudent(s3);
        studentService.addStudent(s4);
        studentService.addStudent(s5);
        studentService.addStudent(s6);
        studentService.addStudent(s7);
        studentService.addStudent(s8);
        studentService.addStudent(s9);
        studentService.addStudent(s10);
        studentService.addStudent(s11);
        studentService.addStudent(s12);
        studentService.addStudent(s13);
        studentService.addStudent(s14);
        studentService.addStudent(s15);


        Role r1 = new Role(null, "ADMIN");
        Role r2 = new Role(null, "STUDENT");
        Role r3 = new Role(null, "REGISTRAR");

        roleRepository.save(r1);
        roleRepository.save(r2);
        roleRepository.save(r3);
        List<Role> roles = new ArrayList<>();
        roles.add(r1);
        roles.add(r2);
        roles.add(r3);

        User u1 = new User(null, "Redi", "Mulu", "Wolde", "redimulu@gmail.com", "test1234",  "redimulu@gmail.com", roles);

//        userRepository.save(u1);
    }

}

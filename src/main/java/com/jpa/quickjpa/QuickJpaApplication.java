package com.jpa.quickjpa;

import com.jpa.quickjpa.models.User;
import com.jpa.quickjpa.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class QuickJpaApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(QuickJpaApplication.class);

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(QuickJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Dela", "Admin");
        userRepository.save(user);
        log.info("inserted user ID is: " + user.getId());

        Optional<User> retreivedUser = userRepository.findById(user.getId());
        log.info("retreived single user is: " + retreivedUser);

        List<User> retreivedUsers = userRepository.findAll();
        log.info("all retreived users are: " + retreivedUsers);
    }
}

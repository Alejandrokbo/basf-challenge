package com.basf.challenge;

import com.basf.challenge.entity.User;
import com.basf.challenge.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    UserRepository repository;

    User alejandro, john, kirk;

    @BeforeEach
    public void setUp() {

        repository.deleteAll();

        alejandro = repository.save(new User("Alejandro", "Cabo"));
        john = repository.save(new User("John", "Doe"));
        kirk = repository.save(new User("Kirk", "Doe"));
    }

    @Test
    public void setsIdOnSave() {

        User alejandro = repository.save(new User("Alejandro", "Cabo"));

        assertThat(alejandro.id).isNotNull();
    }

    @Test
    public void findsByFirstName() {

        List<User> result = repository.findByFirstName("Alejandro");

        assertThat(result).hasSize(1).extracting("firstName").contains("Alejandro");
    }

    @Test
    public void findsByLastName() {

        List<User> result = repository.findByLastName("Cabo");

        assertThat(result).hasSize(1).extracting("firstName").contains("Alejandro");
    }

    @Test
    public void findsByExample() {

        User probe = new User(null, "Doe");

        List<User> result = repository.findAll(Example.of(probe));

        assertThat(result).hasSize(2).extracting("firstName").contains("Kirk", "John");
    }
}

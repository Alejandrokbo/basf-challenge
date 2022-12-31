package com.basf.challenge;

import com.basf.challenge.entity.Patent;
import com.basf.challenge.repository.PatentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PatentRepositoryTests {

    @Autowired
    PatentRepository repository;

    Patent patent1, patent2, patent3;

    @BeforeEach
    public void setUp() {
        repository.deleteAll();
        Patent patent = new Patent();
        patent.setYear(1991);
        patent.setTitle("My Birth");
        patent.setAbstract("<p>Some Text</p>");
        patent1 = repository.save(patent);

        patent = new Patent();
        patent.setYear(2000);
        patent.setTitle("Some Day");
        patent.setAbstract("<p>Some Text</p>");
        patent2 = repository.save(patent);

        patent = new Patent();
        patent.setYear(2015);
        patent.setTitle("Some Day");
        patent.setAbstract("<p>Some Text</p>");
        patent3 = repository.save(patent);
    }

    @Test
    public void setsIdOnSave() {
        Patent patent = new Patent();
        patent.setYear(1991);
        patent.setTitle("Some Title");
        patent.setAbstract("Absurd");
        repository.save(patent);
        assertThat(patent.id).isNotNull();
    }

    @Test
    public void findsByYearTest() {
        List<Patent> result = repository.findByYear(1991);
        assertThat(result).hasSize(1).extracting("year").contains(1991);
    }

    @Test
    public void findsByTitleTest() {
        List<Patent> result = repository.findByTitle("Some Day");
        assertThat(result).hasSize(2).extracting("year").contains(2000);
    }

    @Test
    public void findsByExample() {
        Patent probe = new Patent();
        probe.setTitle("My Birth");
        List<Patent> result = repository.findAll(Example.of(probe));
        assertThat(result).hasSize(1).extracting("year").contains(1991);
    }
}

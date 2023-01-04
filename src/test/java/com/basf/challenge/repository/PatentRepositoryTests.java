package com.basf.challenge.repository;

import com.basf.challenge.entity.Patent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
public class PatentRepositoryTests {

    @Autowired
    PatentRepository repository;

    Patent patent1, patent2, patent3;

    @BeforeEach
    public void setUp() {
        repository.deleteAll();

        var patent = new Patent();
        patent.setYear("1991");

        var titleList = new ArrayList<>();
        var titleMap = new HashMap<String, String>();
        titleMap.put("someTitle", "The day we were happy");
        ;
        titleList.add(titleMap);
        patent.setTitle(titleList);

        var abstractList = new ArrayList<>();
        var abstractMap = new HashMap<String, String>();
        abstractMap.put("1", "Some text");
        abstractMap.put("2", "Edited mself");
        abstractList.add(abstractMap);
        patent.set_abstract(abstractList);
        patent1 = repository.save(patent);

        patent = new Patent();
        patent.setYear("2000");

        titleList = new ArrayList<>();
        titleMap = new HashMap<>();
        titleMap.put("lang_es", "El fin del tiempo");
        titleList.add(titleMap);
        patent.setTitle(titleList);

        abstractList = new ArrayList<>();
        abstractMap = new HashMap<>();
        abstractMap.put("1", "Some text");
        abstractMap.put("2", "Edited by me");
        abstractList.add(abstractMap);
        patent.set_abstract(abstractList);
        patent2 = repository.save(patent);
    }

    @Test
    public void setsIdOnSave() {
        var patent = new Patent();
        patent.setYear("1991");

        var titleList = new ArrayList<>();
        var titleMap = new HashMap<String, String>();
        titleMap.put("someTitle", "The day we were happy");
        titleList.add(titleMap);
        patent.setTitle(titleList);

        var abstractList = new ArrayList<>();
        var abstractMap = new HashMap<Integer, String>();
        abstractMap.put(1, "Some text");
        abstractMap.put(2, "Edited mself");
        abstractList.add(abstractMap);
        patent.set_abstract(abstractList);
        patent1 = repository.save(patent);

        assertThat(patent1.id).isNotNull();
    }

    @Test
    public void findsByYearTest() {
        List<Patent> result = repository.findByYear("1991");
        assertThat(result).hasSize(1).extracting("year").contains("1991");
    }
}

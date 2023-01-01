package com.basf.challenge;

import com.basf.challenge.dto.Book;
import com.basf.challenge.dto.xmlProperties.QuestelPatentDocument;
import com.basf.challenge.entity.Patent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ReadXMLPropertiesTest {

    @Test
    public void convertJavaObjectToXmlTest() throws JsonProcessingException {
        var patent = new Patent();
        patent.setYear(1990);
        patent.setTitle("Tittle1");
        patent.setAbstract("LoremIpsum");

        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(patent);
        System.out.println(xml);
        assertNotNull(xml);
    }

    @Test
    public void readXmlAndAssetAttributesTest() throws IOException {
        var xml = "<Book><id>1</id><name>Book1</name><author>Author1</author><date>1672490911704</date></Book>";
        XmlMapper xmlMapper = new XmlMapper();
        Book value = xmlMapper.readValue(xml, Book.class);
        assertEquals(1, (long) value.getId());
        assertEquals("Book1", value.getName());
        assertEquals("Author1", value.getAuthor());
    }

    @Test
    public void readXmlFileAndAssertAttributes() throws IOException {
        FileInputStream xmlFile = new FileInputStream("src/test/java/com/basf/challenge/book.xml");
        String data = IOUtils.toString(xmlFile, StandardCharsets.UTF_8);
        XmlMapper xmlMapper = new XmlMapper();
        Book value = xmlMapper.readValue(data, Book.class);
        assertEquals(1, (long) value.getId());
        assertEquals("Book1", value.getName());
        assertEquals("Author1", value.getAuthor());
    }

    @Test
    public void readXmlFilePatentsAndAssertNotNull() throws IOException {
        FileInputStream xmlFile = new FileInputStream("src/test/java/com/basf/challenge/US06060938A.xml");
        String data = IOUtils.toString(xmlFile, StandardCharsets.UTF_8);
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        QuestelPatentDocument value = xmlMapper.readValue(data, QuestelPatentDocument.class);
        assertNotNull(value);
    }
}

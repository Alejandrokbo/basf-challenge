package com.basf.challenge.services;

import com.basf.challenge.dto.Book;
import com.basf.challenge.service.xmlService.PatentService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ReadXMLPropertiesTest {

    @Autowired
    private PatentService service;

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
    public void readXmlFilePatentsAndAssertNotNull() throws Exception {
        var questelPatentDocument = service.readXmlData(readXMLFile("src/test/java/com/basf/challenge/US06060938A.xml"));
        assertNotNull(questelPatentDocument);
    }

    private static String readXMLFile(String path) throws IOException {
        FileInputStream xmlFile = new FileInputStream(path);
        return IOUtils.toString(xmlFile, StandardCharsets.UTF_8);
    }
}

package com.basf.challenge.controller;

import com.basf.challenge.contants.ResponseConstants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = ServerStatus.class)
@WithMockUser
public class ControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void verifyStatusServer_and_contentTypeHeaderTest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/status").accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        var jsonExpected = format("{\"status\":\"%s\",\"message\":\"%s\"}",
                ResponseConstants.OK.getStatus(),
                ResponseConstants.OK.getMessage());
        assertEquals(200, result.getResponse().getStatus());
        assertEquals(String.valueOf(MediaType.APPLICATION_JSON), result.getResponse().getHeader("Content-Type"));
        JSONAssert.assertEquals(jsonExpected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void verifyError404Test() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/any").accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(404, result.getResponse().getStatus());
    }
}

package me.benhunter.springcontrolleradviceexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void controllerRespondsWithBadRequest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/")
                .content("BAD CONTENT");
        this.mvc.perform(requestBuilder)
                .andExpect(status().isBadRequest());
    }

    @Test
    void controllerRespondsWithOk() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        this.mvc.perform(requestBuilder)
                .andExpect(status().isOk());
    }
}

package org.spring.wagavinproject.integrationTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.wagavinproject.SpringBootApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = SpringBootApplicationRunner.class)
@AutoConfigureMockMvc

public class ControlIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetHouseInfo() throws Exception {

        mvc.perform(get("/persons/1/house")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetChildInfo() throws Exception {

        // simulate the submit (GET)
        mvc.perform(get("/children/1/info")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetColor() throws Exception {

        // simulate the submit (GET)
        mvc.perform(get("/children/1/color")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

}

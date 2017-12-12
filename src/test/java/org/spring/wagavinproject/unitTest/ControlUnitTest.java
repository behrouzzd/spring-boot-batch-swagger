package org.spring.wagavinproject.unitTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.spring.wagavinproject.SpringBootApplicationRunner;
import org.spring.wagavinproject.controller.PersonController;
import org.spring.wagavinproject.controller.dto.ChildInfo;
import org.spring.wagavinproject.controller.dto.ColorInfo;
import org.spring.wagavinproject.controller.dto.HouseInfo;
import org.spring.wagavinproject.data.enums.HouseType;
import org.spring.wagavinproject.service.PersonServiceImpl;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = SpringBootApplicationRunner.class)
@AutoConfigureMockMvc

public class ControlUnitTest {

    private MockMvc mockMvc;

    @Mock
    private PersonServiceImpl personService;

    @InjectMocks
    private PersonController personController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
    }

    @Test
    public void testGetHouseInfo() throws Exception {

        //create a houseInfo
        HouseInfo houseInfo = new HouseInfo("Behrouz", "Germany", "70199", HouseType.HOUSE);

        when(personService.getHouseInfo(any(Long.class))).thenReturn(houseInfo);

        // simulate the submit (GET)
        mockMvc.perform(get("/persons/1/house")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetChildInfo() throws Exception {

        //create a childInfo
        ChildInfo childInfo = new ChildInfo();
        childInfo.setName("Behrouz Zamani");
        childInfo.setAge(30);

        when(personService.getChildInfo(any(Long.class))).thenReturn(childInfo);

        // simulate the submit (GET)
        mockMvc.perform(get("/children/1/info")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetColor() throws Exception {

        //create a colorInfo
        ColorInfo colorInfo = new ColorInfo("Blue");

        when(personService.getColorInfo(any(Long.class))).thenReturn(colorInfo);

        // simulate the submit (GET)
        mockMvc.perform(get("/children/1/color")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

}

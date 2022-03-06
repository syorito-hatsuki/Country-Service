package dev.syorito_hatsuki.country_service.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CountryRequestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/countries request test")
    void testCountriesGetRequest() throws Exception {
        mockMvc.perform(get("/countries"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*").isArray());
    }

    @Test
    @DisplayName("/countries/{name} test with specify contry")
    void testCountryInfoByName() throws Exception {
        mockMvc.perform(get("/countries/Finland"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Finland")))
                .andExpect(jsonPath("$.country_code", is("FI")))
                .andExpect(jsonPath("$.capital", is("Helsinki")))
                .andExpect(jsonPath("$.population", isA(Integer.class)))
                .andExpect(jsonPath("$.flag_file_url", isA(String.class)));
    }
}

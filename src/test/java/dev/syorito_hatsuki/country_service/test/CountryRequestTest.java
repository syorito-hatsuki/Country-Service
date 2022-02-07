package dev.syorito_hatsuki.country_service.test;

import dev.syorito_hatsuki.country_service.countries.controller.CountriesController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Tried to add object validation, but not understand how :(
 * I tried use isA(<Object>)
 */
public class CountryRequestTest {

    private final MockMvc mockMvc
            = MockMvcBuilders.standaloneSetup(new CountriesController()).build();

    @Test
    @DisplayName("/countries request test")
    void testCountriesGetRequest() throws Exception {
        mockMvc.perform(get("/countries"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.*").isArray());
    }

    @Test
    @DisplayName("/countries/{name} test with specify contry")
    void testCountryInfoByName() throws Exception {
        mockMvc.perform(get("/countries/Finland"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name", is("Finland")))
                .andExpect(jsonPath("$.country_code", is("FI")))
                .andExpect(jsonPath("$.capital", is("Helsinki")))
                .andExpect(jsonPath("$.population", isA(Integer.class)))
                .andExpect(jsonPath("$.flag_file_url", isA(String.class)));
    }
}

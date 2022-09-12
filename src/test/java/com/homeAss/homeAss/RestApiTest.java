package com.homeAss.homeAss;

import com.homeAss.exception.NoPlaceIdException;
import com.homeAss.models.PlaceLocalEntry;
import com.homeAss.service.RestConssumerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertTrue;


@ExtendWith(SpringExtension.class)
@TestPropertySource("classpath:application.properties")
class RestApiTest {

    @InjectMocks
    private RestConssumerService restConssumerService;

    @Value("${res.api.url}")
    public String apiUrl;

    @Value("${rest.api.place.id.1}")
    public String placeId1;

    @Value("${rest.api.place.id.2}")
    public String placeId2;


    @Test
    public void testRestReturnsInfo1IsOk() throws NoPlaceIdException {

        PlaceLocalEntry placeLocalEntry = restConssumerService.placeLocalEntryRest(apiUrl, placeId1);

        assertTrue(placeLocalEntry!=null);
    }

    @Test
    public void testRestReturnsInfo2IsOk() throws NoPlaceIdException {

        PlaceLocalEntry placeLocalEntry = restConssumerService.placeLocalEntryRest(apiUrl, placeId2);

        assertTrue(placeLocalEntry!=null);
    }

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        try {
            restConssumerService.placeLocalEntryRest(apiUrl, null);
        } catch (NoPlaceIdException e) {
            assertTrue(!e.getMessage().isEmpty());
        }
    }

    @Test
    public void whenExceptionThrown() {
        try {
            restConssumerService.placeLocalEntryRest(apiUrl, "");
        } catch (NoPlaceIdException e) {
            assertTrue(!e.getMessage().isEmpty());
        }
    }

}

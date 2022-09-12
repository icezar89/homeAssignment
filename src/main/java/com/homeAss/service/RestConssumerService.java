package com.homeAss.service;

import com.homeAss.exception.NoPlaceIdException;
import com.homeAss.models.PlaceLocalEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Service
public class RestConssumerService {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private Environment environment;

    public PlaceLocalEntry consumeRest() throws NoPlaceIdException {

        log.info("Start reading api");

        String apiUrl = environment.getProperty("res.api.url");
        String restPlaceId = environment.getProperty("rest.api.place.id.1");

        if(!StringUtils.hasLength(restPlaceId)){
            log.error("Place id not found");

            throw new NoPlaceIdException("Place id not found");
        }

//        StringBuilder buildApiUrl = new StringBuilder(apiUrl).append(restPlaceId);
        StringBuilder buildApiUrl = new StringBuilder(apiUrl);

        return callRest(buildApiUrl.toString());
    }

    //most cases used for test
    public PlaceLocalEntry placeLocalEntryRest(String restApiUrl, String restPlaceId) throws NoPlaceIdException {

        if(!StringUtils.hasLength(restPlaceId)){
            log.error("Place id not present");

            throw new NoPlaceIdException("Place id not present");
        }

        StringBuilder buildApiUrl = new StringBuilder(restApiUrl).append(restPlaceId);

        return callRest(buildApiUrl.toString());
    }


    private PlaceLocalEntry callRest(String restApiUrl){
        RestTemplate restTemplate = new RestTemplate();

        PlaceLocalEntry placeLocalEntry = restTemplate.getForObject(restApiUrl, PlaceLocalEntry.class);

        log.info(placeLocalEntry);


        log.info("Api read finish");
        
        return placeLocalEntry;
    }


}

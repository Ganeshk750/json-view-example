package com.example.jsonviewexample.cach;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CityService {

    private final CityRepository cityRepository;

    public City getCityById(Integer id){
        log.info(":::::::::::::::::::"+ "findById::"+ id);
        return cityRepository.findById(id).get();
    }

    public City saveCity(City city){
        return cityRepository.save(city);
    }
}

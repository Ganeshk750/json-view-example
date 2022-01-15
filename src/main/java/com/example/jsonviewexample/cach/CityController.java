package com.example.jsonviewexample.cach;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CityController {

 private final CityService cityService;

 @GetMapping("/cities/{id}")
 public ResponseEntity<City> getCityById(@PathVariable(name="id") Integer id){
     City city = cityService.getCityById(id);
     return new ResponseEntity<>(city, HttpStatus.OK);
 }

 @PostMapping("/cities")
 public ResponseEntity<City> saveCity(@RequestBody City city){
     City city1 = cityService.saveCity(city);
     return new ResponseEntity<>(city1, HttpStatus.OK);
 }

}

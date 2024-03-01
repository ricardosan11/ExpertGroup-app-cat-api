package com.appcatapi.controllers;

import com.appcatapi.services.BreedService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("BreedApi/v1")
@RequiredArgsConstructor
@Slf4j
public class BreedController {

    private final BreedService breedService;

    @GetMapping("/breeds")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(breedService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/breed/{breed_id}")
    public ResponseEntity<?> getById(@PathVariable String breed_id){
        return new ResponseEntity<>(breedService.getById(breed_id), HttpStatus.OK);
    }

    @GetMapping("/breed/search")
    public ResponseEntity<?> search(@RequestParam("name") String name){
        return new ResponseEntity<>(breedService.search(name), HttpStatus.OK);
    }
}

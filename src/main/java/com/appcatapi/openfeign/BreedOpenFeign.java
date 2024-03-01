package com.appcatapi.openfeign;


import com.appcatapi.dtos.BreedDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "Breed", url = "https://api.thecatapi.com/v1")
public interface BreedOpenFeign {

    @GetMapping("/breeds")
    List<BreedDTO> getBreeds();

    @GetMapping("/breeds/{breed_id}")
    BreedDTO getById(@PathVariable String breed_id);

    @GetMapping("/breeds/search")
    List<BreedDTO> search(@RequestParam("name") String name);
}

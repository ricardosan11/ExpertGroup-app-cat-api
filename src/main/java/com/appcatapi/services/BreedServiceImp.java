package com.appcatapi.services;

import com.appcatapi.dtos.BreedDTO;
import com.appcatapi.openfeign.BreedOpenFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BreedServiceImp implements BreedService{

    private final BreedOpenFeign breedOpenFeign;

    @Override
    public List<BreedDTO> getAll() {
        return breedOpenFeign.getBreeds();
    }

    @Override
    public BreedDTO getById(String id) {
        return breedOpenFeign.getById(id);
    }

    @Override
    public List<BreedDTO> search(String contains) {
        return breedOpenFeign.search(contains);
    }
}

package com.appcatapi.services;

import com.appcatapi.dtos.BreedDTO;

import java.util.List;

public interface BreedService {

     List<BreedDTO> getAll();

     BreedDTO getById(String id);

     List<BreedDTO> search(String contains);
}

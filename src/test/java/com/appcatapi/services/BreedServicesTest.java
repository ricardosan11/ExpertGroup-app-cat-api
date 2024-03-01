package com.appcatapi.services;

import com.appcatapi.dtos.BreedDTO;
import com.appcatapi.openfeign.BreedOpenFeign;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BreedServicesTest {

    @Mock
    private BreedOpenFeign breedOpenFeign;
    @InjectMocks
    private BreedServiceImp breedService;

    private List<BreedDTO> getAllBreedAutomatic(){
        List<BreedDTO> breeds = new ArrayList<>();
        breeds.add(BreedDTO.builder().id("test1").name("test1").origin("test1").build());
        breeds.add(BreedDTO.builder().id("test2").name("test2").origin("test2").build());

        return breeds;
    }

    @Test
    void getAllTest(){
        when(breedOpenFeign.getBreeds()).thenReturn(getAllBreedAutomatic());
        List<BreedDTO> breeds = breedService.getAll();
        assertEquals(breeds.size(),2);
    }

    @Test
    void getById(){
        BreedDTO breedDTO = BreedDTO.builder().id("test").name("test").origin("test").build();
        assertNotNull(breedDTO);
        assertEquals("test", breedDTO.getId());
        assertEquals("test", breedDTO.getName());
        assertEquals("test", breedDTO.getOrigin());
    }

}

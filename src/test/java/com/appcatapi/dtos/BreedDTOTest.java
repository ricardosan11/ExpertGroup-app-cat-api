package com.appcatapi.dtos;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BreedDTOTest {

    @Test
    void constructorTest(){
        BreedDTO breedDTO = BreedDTO.builder().id("test").name("test").origin("test").build();
        assertNotNull(breedDTO);
        assertEquals("test", breedDTO.getId());
        assertEquals("test", breedDTO.getName());
        assertEquals("test", breedDTO.getOrigin());
    }
}

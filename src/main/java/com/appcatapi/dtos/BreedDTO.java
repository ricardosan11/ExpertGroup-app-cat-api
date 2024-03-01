package com.appcatapi.dtos;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BreedDTO {

    private String id;
    private String name;
    private String origin;
}

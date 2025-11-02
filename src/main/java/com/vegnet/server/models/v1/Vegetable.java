package com.vegnet.server.models.v1;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vegetable {
    private Long vegetableId;
    private String vegetableName;
    private List<VegetableEdibilityType> vegetableEdibilityType;
    private VegetableGenomeType vegetableGenomeType;
    
}

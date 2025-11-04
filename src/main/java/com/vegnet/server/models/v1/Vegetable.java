package com.vegnet.server.models.v1;

import java.util.List;

import com.vegnet.server.models.v1.future.VegetableGenomeType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vegetable // implements Food?? // for future
 {
    private Long vegetableId;
    private String vegetableName;
    private List<VegetableEdibilityType> vegetableEdibilityType;
    private VegetableGenomeType vegetableGenomeType;

    // @Override
    // public Long getProductId() {
    //    return this.vegetableId;
    // }
    
    // @Override
    // public String getName() {
    //     return this.vegetableName;
    // }
    
}

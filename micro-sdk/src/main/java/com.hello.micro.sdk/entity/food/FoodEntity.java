package com.hello.micro.sdk.entity.food;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FoodEntity {

    private Integer id;

    private String name;

    private String flavorIds;

    private String materialIds;

    private String pictures;

    private Integer styleId;
}

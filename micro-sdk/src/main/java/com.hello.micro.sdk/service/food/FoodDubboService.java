package com.hello.micro.sdk.service.food;

import com.hello.micro.sdk.entity.food.FoodEntity;

import java.util.List;

public interface FoodDubboService {

    List<FoodEntity> getAllFoods();
}

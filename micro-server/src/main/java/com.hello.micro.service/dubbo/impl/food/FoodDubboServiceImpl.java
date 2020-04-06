package com.hello.micro.service.dubbo.impl.food;

import com.alibaba.dubbo.config.annotation.Service;
import com.hello.micro.sdk.entity.food.FoodEntity;
import com.hello.micro.sdk.service.food.FoodDubboService;
import com.hello.micro.service.model.food.Food;
import com.hello.micro.service.service.food.FoodService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Service(interfaceClass = FoodDubboService.class)
public class FoodDubboServiceImpl implements FoodDubboService {

    @Autowired
    private FoodService foodService;

    @Override
    public List<FoodEntity> getAllFoods() {
        List<Food> foodList = foodService.getAllFood();

        List<FoodEntity> foodEntityList = foodList.stream().map(food -> {
            FoodEntity foodEntity = FoodEntity.builder().build();
            BeanUtils.copyProperties(food, foodEntity);
            return foodEntity;
        }).collect(Collectors.toList());
        return foodEntityList;
    }
}

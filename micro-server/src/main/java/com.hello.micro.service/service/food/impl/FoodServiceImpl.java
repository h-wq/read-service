package com.hello.micro.service.service.food.impl;

import com.hello.micro.service.mapper.food.FoodMapper;
import com.hello.micro.service.model.food.Food;
import com.hello.micro.service.model.food.FoodExample;
import com.hello.micro.service.service.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getAllFood() {
        FoodExample example = new FoodExample();
        List<Food> foods = foodMapper.selectByExample(example);
        return foods;
    }
}

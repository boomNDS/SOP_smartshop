package com.sop.shop.restaurant.repository;
import com.sop.shop.restaurant.models.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Integer> {

}
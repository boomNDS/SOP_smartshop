package com.sop.shop.restaurant.controller;

import com.sop.shop.restaurant.models.Food;
import com.sop.shop.restaurant.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(path="/restaurant")
public class MainController {
    @Autowired
    private FoodRepository FoodRepository;
    @RequestMapping(value = "/read/{index}", method = RequestMethod.GET)
    public Iterable<Food> read(@PathVariable int index){
        return FoodRepository.findAllById(Collections.singleton(index));
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewFood (@RequestParam String name
            , @RequestParam int price) {
        Food n = Food.getInstance();
        n.setName(name);
        n.setPrice(price);
        FoodRepository.save(n);
        return "Saved";
    }
    @RequestMapping(value = "/update/{index}", method = RequestMethod.POST)
    public ResponseEntity<Food> update(@PathVariable int index,@RequestBody Food food) {
        for(Food i: getAllFoods()) {
            if(i.getId() == index) {
                i.setName(food.getName());
                i.setPrice(food.getPrice());
                food.setId(i.getId());
                FoodRepository.save(i);
            }
        }
        return new ResponseEntity<Food>(food, HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{index}", method = RequestMethod.DELETE)
    public Iterable<Food>  delete(@PathVariable int index) {
        for(Food i: getAllFoods()) {
            if(FoodRepository.existsById(index)) {
                FoodRepository.deleteById(index);
            }
        }
        return FoodRepository.findAll();
    }
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteAll(@PathVariable int index) {
        FoodRepository.deleteAll();
        return "deleteall data";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Food> getAllFoods() {
        // This returns a JSON or XML with the users
        return FoodRepository.findAll();
    }
}
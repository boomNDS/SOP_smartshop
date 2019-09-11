package com.sop.shop;

import com.sop.shop.stores.item;
import com.sop.shop.stores.Store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@RestController
//@EnableAutoConfiguration
public class ShopApplication {
	@RequestMapping("/")
	String home() {
		return "/shop to get all info about shoping lists" +
				"/foods for show all food" +
				"/computers for show all computers" +
				"/medicine for show all medicine"+
				"/costlower/{cost}";
	}
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
//	@RequestMapping("/shop")
//	public List<item> allsales(){
//		return  Store.getAllItem();
//	}
//	@RequestMapping("/foods")
//	public List<item> allFood(){
//		return  Store.getCategory("food");
//	}
//	@RequestMapping("/computers")
//	public List<item> allComputers(){
//		return  Store.getCategory("computer");
//	}
//	@RequestMapping("/medicine")
//	public List<item> allMedicine(){
//		return Store.getCategory("medicine");
//	}
//	@RequestMapping(value = "/costlower/{cost}", method = RequestMethod.GET)
//	public List<item> CostLower(@PathVariable int cost){
//		return Store.getCostlower(cost);
//	}

}

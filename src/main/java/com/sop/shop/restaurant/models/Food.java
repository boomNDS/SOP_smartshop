package com.sop.shop.restaurant.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public final class Food {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private static Food INSTANCE;
    private Integer id;
    private String name;
    private int price;
    public static Food getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Food();
        }

        return INSTANCE;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

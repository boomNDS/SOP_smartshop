package com.sop.shop.stores;

public class Computer implements item{
    private String name;
    private String info;
    private int cost;
    private String category;
    @Override
    public String getinfo() {
        return this.info;
    }

    @Override
    public void setinfo(String info) {
        this.info = info;
    }

    @Override
    public int getcost() {
        return this.cost;
    }

    @Override
    public void setcost(int cost) {
        this.cost = cost;
    }

    @Override
    public String getname() {
        return this.name;
    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getcategory() {
        return this.category;
    }

    @Override
    public void setcategory(String category) {
        this.category = category;
    }

    @Override
    public String getitem() {
        return  this.name+" "+this.cost+" "+this.category;
    }
}

package com.sop.shop.stores;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Store  implements Serializable {
    public Store(){}
    public static item createFood(String name,String category,int cost,String info) {
        item food = new Food();
        food.setname(name);
        food.setcategory(category);
        food.setcost(cost);
        food.setinfo(info);
        return food;
    }
    public static item createComputer(String name,String category,int cost,String info) {
        item computer = new Computer();
        computer.setname(name);
        computer.setcategory(category);
        computer.setcost(cost);
        computer.setinfo(info);
        return computer;
    }
    public static item createMedicine(String name,String category,int cost,String info) {
        item medicine = new Medicine();
        medicine.setname(name);
        medicine.setcategory(category);
        medicine.setcost(cost);
        medicine.setinfo(info);
        return medicine;
    }
    public static List<item> getAllItem(){
        LinkedList<item> items = new LinkedList<>();
        items.add(Store.createFood("น้ำ","food",30,"น้ำดื่มจากธรรมชาติ"));
        items.add(Store.createFood("เนื้อหมู","food",50,"เนื้อหมูคุณภาพดี คัดมาเพื่อคุณ"));
        items.add(Store.createComputer("Surface","computer",14990,"Microsoft Tablet Surface GO Intel Pentium Gold Processor 4415Y/4GB/64GB/10inch"));
        items.add(Store.createComputer("Dell Inspiron ","computer",57845,"Notebook Dell Inspiron Gaming G5-W5660151702BTHW10 (White)"));
        items.add(Store.createMedicine("พาราเซตามอล","medicine",35,"ยาพาราเซตามอล เป็นยาบรรเทาอาการปวดระดับเล็กน้อยถึงปานกลาง และบางครั้งยังใช้ลดไข้ในเด็กและผู้ใหญ่ จัดเป็นยาสามัญประจำบ้าน และเป็นยาที่ไม่อันตราย"));
        return items;
    }
    public static  List<item> getCategory(String type){
        LinkedList<item> items = new LinkedList<>();
        for(item i: getAllItem()){
            System.out.println(i.getcategory() == type);
            if(i.getcategory() == type){
                items.add(i);
            }
        }
        return  items;
    }
    public static  List<item> getCostlower(int cost){
        LinkedList<item> items = new LinkedList<>();
        for(item i: getAllItem()){
//            System.out.println(i.getcost() <= cost);
            if(i.getcost() <= cost){
                items.add(i);
            }
        }
        return  items;
    }
}

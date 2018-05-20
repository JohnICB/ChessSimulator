/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author Eduard
 */
public class Vehicle extends Item implements Asset{
    int performance;

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

    public Vehicle(String name, int price, int performance) {
        this.name=name;
        this.price=price;
        this.performance=performance;
    }
    
    public int computeProfit(){
        return this.performance/this.price;
    }
    
     @Override
    public String toString(){
        return name;
    }
    
}

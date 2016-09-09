/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gleea
 */
public class Pizza {
    static String description;
    static double cost;
    int size;
    
    public Pizza(String description, double cost, int size){
        this.description=description;
        this.cost=cost;
        this.size=size;
    }
    
   //@Override
    public String toString(){
        return "Name:"+description+"Cost:"+cost;    
    }
    
    static public String getDescription(){
        return description;
    }

  
    static public double getCost(){
        return cost;
    }

 
    
}

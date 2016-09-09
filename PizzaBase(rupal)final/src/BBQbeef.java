/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gleea
 */
public class BBQbeef extends Pizza{
    public int qty; static BBQbeef bbqbeef;
    public BBQbeef(String description, double cost, int size, int qty) {
        super(description, cost, size);
        this.qty=qty;
    }
    
    static public String getDescription(){
        return "BBQ Beef";
    }
    static public double getCost(){
        if(bbqbeef.size==6){
        return 80;
        }
        else if(bbqbeef.size==9){
        return 90;
        }
        return 100;
        
    }
    
    public int size(){
       return bbqbeef.size;
    }

}

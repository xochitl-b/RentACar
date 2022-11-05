/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author lafla
 */
public class Car implements CarInterface{
    //car attributes according to the brief
    private Make make;
    private double rate;
    private int ID;
    private int availability;
    
    
    public Car(int ID, Make make, double rate){
        this.make = make;
        this.rate = rate;
        this.ID = ID;
    }    
    
    //this is clearly not right but I'm trying
    
    @Override
    public Map<Month, boolean[]> createAvailability() {
        //boolean[] boolArray = new boolean[12];//one per month?
        //Arrays.fill(boolArray, Boolean.TRUE); // https://www.tutorialspoint.com/how-can-we-initialize-a-boolean-array-in-java#:~:text=The%20boolean%20array%20can%20be,array%20with%20true%20or%20false.
        
        HashMap<Month, boolean[]> hmap = new HashMap<>();    
        hmap.put(Month.APRIL, new boolean[]{true,false});
//        hmap.put(Month.AUGUST, boolArray );
//        hmap.put(Month.DECEMBER, boolArray );
//        hmap.put(Month.FEBRUARY, boolArray );
//        hmap.put(Month.JANUARY, boolArray );
//        hmap.put(Month.JULY, boolArray );
//        hmap.put(Month.JUNE, boolArray );
//        hmap.put(Month.MARCH, boolArray );
//        hmap.put(Month.MAY, boolArray );
//        hmap.put(Month.NOVEMBER, boolArray );
//        hmap.put(Month.OCTOBER, boolArray );
//        hmap.put(Month.SEPTEMBER, boolArray );
        
        //for (String availability : hmap.get(true)){
        //    System.out.println(availability);
        //}
        
    return null;   
    }

    @Override
    public Make getMake() {
        return this.make;
    }

    @Override
    public void setMake(Make make) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getRate() {
        return this.rate;
    }

    @Override
    public void setRate(double rate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getId() {
        return this.ID;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

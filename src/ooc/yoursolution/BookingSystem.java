/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author lafla
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
    //setting up the buffered reader and the different attributes to be read
    String title =in.readLine();
    String make ="";
    int dailyRate =0;
    int availability =0;
    //we call the car interface and make a new one called fleet
    CarInterface car = new fleet();
    //we need a loop to read through the document
    while(title !=null){
        //make =in.readLine();
        //dailyRate = in.read();
        //availability = in.read();
        
        //fleet car1= new fleet(make,dailyRate,availability);
        //car.addItem(car);
        make = in.readLine();
        
    }
    return car;
    }
    
}

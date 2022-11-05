/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import ooc.enums.Make;

/**
 *
 * @author lafla
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        //setting up the buffered reader and the different attributes to be read
        String name =in.readLine();//name of the renting place is the first line to be read
        
        //we call the car interface and make a new one called fleet
        RentACarInterface rentACarShop = new RentACar(name);

        //String make;
        //int rate =0;
        //int availability =0;
        String carDetails;//string variable to save the line we read
        String makeString;
        String rateString;
        String availabilityString;
        ArrayList<CarInterface> carList = new ArrayList();//ArrayList to store created cars
    

    //we need a loop to read through the document
    
    while(name !=null){
        //we read the first line as the car details and save the entire line
        //we are spleating the line we saved as carDetails by the ":" char on a array. then assign accordign to position to different attributes.
        //there is probably a better way to get around the string to int conversions. This is my best shot. :(
        carDetails = in.readLine();
        String[] result = carDetails.split(":");
        makeString = result[0];
        Make make = Make.valueOf(makeString);//to convert make as a string to as a Make enum
        rateString = result[1];
        double rate = Double.parseDouble(rateString);//to convert rate as a string to as a rate double
        availabilityString = result[2];
        int availability = Integer.parseInt(availabilityString);
 
       //for loop Creates a car object for every car we have available 
        for (int i = 1;i<=availability;i++){
            Car car = new Car(make,rate,availability);
            carList.add(car);
        }

   
    }
    rentACarShop.setCars(carList);
    return rentACarShop;  
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartment;

/**
 *
 * @author arnol
 */
//Create a class named Apartment that holds an apartment number, 
//number of bedrooms, number of baths, and rent amount. 
//Create a constructor that accepts values for each data field. Also create a get method for each field. 
//Write an application that creates at least five Apartment objects. 
//Then prompt a user to enter a minimum number of bedrooms required, a minimum number of baths required, 
//and a maximum rent that the user is willing to pay. 
//Display data for all the Apartment objects that meet the user’s criteria or an appropriate message 
//if no such apartments are available. Save the files as Apartment.java and TestApartments.java
public class Apartment {
    private int apartNumber;
    private int bedrooms;
    private int bathrooms;
    private double monthlyRent;
    
    //Constructor for Apartment class
    public Apartment (int apartNumber, int bedrooms, int bathrooms, double monthlyRent) {
        this.apartNumber = apartNumber;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        if (monthlyRent > 0.00) {
            this.monthlyRent = monthlyRent;
        }
    }
    
    // Get method for each field
    public void setApartNumber (int apartNumber) {
        this.apartNumber = apartNumber;
    }
    public int getApartNumber() {
        return apartNumber;
    }
    public void setBedrooms (int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBathrooms (int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }
    public void setMonthlyRent (double monthlyRent) {
        if (monthlyRent > 0.00) {
            this.monthlyRent = monthlyRent;
        }
    }
    public double getMonthlyRent() {
        return monthlyRent;
    }
}

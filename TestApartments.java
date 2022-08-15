/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment;

/**
 *
 * @author arnol
 */
import java.util.*;

/**
 *
 * @author arnol
 */
public class TestApartments {
    // Array to hold Apartment values: minimum of five
    public static void main(String[] args) {
        Apartment apart1 = new Apartment(1, 1, 1, 1000.00);
        Apartment apart2 = new Apartment(2, 2, 2, 2000.00);
        Apartment apart3 = new Apartment(3, 3, 3, 3000.00);
        Apartment apart4 = new Apartment(4, 4, 4, 4000.00);
        Apartment apart5 = new Apartment(5, 5, 5, 5000.00);
        
        Apartment[] apartmentList = {apart1, apart2, apart3, apart4, apart5};
        //Then prompt a user to enter a minimum number of bedrooms required, a minimum number of baths required, 
        //and a maximum rent that the user is willing to pay. 
        //Display data for all the Apartment objects that meet the user’s criteria or an appropriate message 
        Scanner inputData = new Scanner(System.in);
        System.out.println("What is your minimum number of bedrooms?");
        int bedrooms = inputData.nextInt();
        System.out.println("What is your minimum number of bathrooms?");
        int bathrooms = inputData.nextInt();
        System.out.println("What is the maximum rent you are willing to pay?");
        double monthlyRent = inputData.nextDouble();
        
        processInput(apartmentList, bedrooms, bathrooms, monthlyRent);
 
    }
    
    //This calculates or rather searches for apartments that meet the user's criteria and brings back the value
    public static void processInput(Apartment[] apartmentList, int bedrooms, int bathrooms, double monthlyRent) {
        int counter = countApartments(apartmentList, bedrooms, bathrooms, monthlyRent);  
        System.out.println("There are the number of apartments that meet your criteria: " + counter);
        for (Apartment apartSearch : apartmentList) {
            if (apartSearch.getBedrooms() >= bedrooms && apartSearch.getBathrooms() >= bathrooms && apartSearch.getMonthlyRent() <= monthlyRent ) {
                System.out.printf("Apartment " + apartSearch.getApartNumber() + " is available with " + apartSearch.getBedrooms() +
                " bedrooms and " + apartSearch.getBathrooms() + " bathrooms. It will cost you R%,.2f", apartSearch.getMonthlyRent());
                System.out.print(" per month.\n");
                counter ++;
            }
        }
    }
    
    //outsourced method for counter
    public static int countApartments(Apartment[] apartmentList, int bedrooms, int bathrooms, double monthlyRent) {
        int counter = 0;
        for (Apartment apartSearch : apartmentList) {
            if (apartSearch.getBedrooms() >= bedrooms && apartSearch.getBathrooms() >= bathrooms && apartSearch.getMonthlyRent() <= monthlyRent ) {
                counter++;
            }
         }
        return counter;
    }
}
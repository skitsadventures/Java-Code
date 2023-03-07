/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artistsearchoop;

/**
 *
 * @author mackr
 */
import java.util.Scanner;

public class Customer  {

        
      
        private String customerName;
        private int contactNumber;
        private double productPrice;
        private int numberOfMonths;
        private double monthlyRepayment;

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the customer name:");
            customerName = in.nextLine();
        }

        public int getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the customer number:");
            contactNumber = Integer.parseInt(in.nextLine());
        }

        public double getProductPrice() {
            return productPrice;
        }

        public void setProductPrice() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the product price:");
            productPrice = Double.parseDouble(in.nextLine());
        }

        public int getNumberOfMonths() {
            return numberOfMonths;
        }

        public void setNumberOfMonths() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of months:");
            numberOfMonths = Integer.parseInt(in.nextLine());
        }

        public void calculateMonthlyRepayment() {
            monthlyRepayment = productPrice / numberOfMonths;
        }
    }
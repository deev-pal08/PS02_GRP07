package Retailshop;

import java.util.Scanner;

//Retail class with properties
public class Retail {
    public String name;
    public String phone;
    public String locality;
    public String status;

    //constructor for Retail class
    private Retail(String name, String phone, String locality, String status) {
        this.name = name;
        this.phone = phone;
        this.locality = locality;
        this.status = status;
    }

    //method to initialize retail class object
    public static Retail setRetailShop(){
        String name = null, phone = null, locality = null, status = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter retail shop's name: ");
        name = sc.next();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        phone = sc.nextLine();
        System.out.println("Enter locality: ");
        locality = sc.nextLine();
        System.out.println("Enter delivery status [Out for Delivery, Delivered, Yet to Be Delivered]: ");
        status = sc.nextLine();

        Retail retail = new Retail(name,phone,locality,status);
        return(retail);
    }
}

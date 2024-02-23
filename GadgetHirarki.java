/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hirarkigadget;

/**
 *
 * @author Carissa Amanda
 */
abstract class HirarkiGadget {
    String brand;
    String type;

    public HirarkiGadget(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    abstract void displayBarang();
}

class Handphone extends HirarkiGadget {
    public Handphone(String brand, String type) {
        super(brand, type);
    }

    @Override
    void displayBarang() {
        System.out.println("Handphone - Brand: " + brand + ", Type: " + type);
    }
}

class Tablet extends HirarkiGadget {
    String operatingSystem;

    public Tablet(String brand, String type, String operatingSystem) {
        super(brand, type);
        this.operatingSystem = operatingSystem;
    }

    @Override
    void displayBarang() {
        System.out.print("Tablet - Brand: " + brand + ", Type: " + type);
        if (!brand.equalsIgnoreCase("Apple")) {
            System.out.println(", OS: " + operatingSystem);
        } else {
            System.out.println();
        }
    }
}

class Laptop extends HirarkiGadget {
    public Laptop(String brand, String type) {
        super(brand, type);
    }

    @Override
    void displayBarang() {
        System.out.println("Laptop - Brand: " + brand + ", Type: " + type);
    }
}

public class GadgetHirarki {
    public static void main(String[] args) {
        Handphone handphone = new Handphone("Samsung", "S24 Ultra");
        Tablet tablet = new Tablet("Apple", "iPad Pro 12", "iOS");
        Laptop laptop = new Laptop("Asus", "TUF Gaming F15");

        handphone.displayBarang();
        tablet.displayBarang();
        laptop.displayBarang();
    }
}

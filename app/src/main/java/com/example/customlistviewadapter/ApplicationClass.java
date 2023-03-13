package com.example.customlistviewadapter;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Product> carsStore;

    @Override
    public void onCreate() {
        super.onCreate();

        carsStore = new ArrayList<Product>();

        carsStore.add(new Product("Toyota", "Affordable and reliable", "Corolla", 20000.00, true));
        carsStore.add(new Product("Honda", "Safe and efficient", "Civic", 22000.00, false));
        carsStore.add(new Product("Ford", "American muscle", "Mustang", 35000.00, true));
        carsStore.add(new Product("BMW", "Luxury and performance", "M3", 60000.00, false));
        carsStore.add(new Product("Mercedes-Benz", "Elegance and refinement", "S-Class", 80000.00, true));

        carsStore.add(new Product("Chevrolet", "Iconic American brand", "Corvette", 60000.00, true));
        carsStore.add(new Product("Dodge", "Muscle cars and SUVs", "Challenger", 35000.00, false));
        carsStore.add(new Product("Jeep", "Off-road and adventure", "Wrangler", 28000.00, true));
        carsStore.add(new Product("Audi", "German engineering and luxury", "A4", 40000.00, false));
        carsStore.add(new Product("Lexus", "Japanese luxury", "RX", 45000.00, true));

        carsStore.add(new Product("Toyota", "Affordable and reliable", "Corolla", 20000.00, true));
        carsStore.add(new Product("Honda", "Safe and efficient", "Civic", 22000.00, false));
        carsStore.add(new Product("Ford", "American muscle", "Mustang", 35000.00, true));
        carsStore.add(new Product("BMW", "Luxury and performance", "M3", 60000.00, false));
        carsStore.add(new Product("Mercedes-Benz", "Elegance and refinement", "S-Class", 80000.00, true));
        carsStore.add(new Product("Chevrolet", "Iconic American brand", "Corvette", 60000.00, true));
        carsStore.add(new Product("Dodge", "Muscle cars and SUVs", "Challenger", 35000.00, false));
        carsStore.add(new Product("Jeep", "Off-road and adventure", "Wrangler", 28000.00, true));
        carsStore.add(new Product("Audi", "German engineering and luxury", "A4", 40000.00, false));
        carsStore.add(new Product("Lexus", "Japanese luxury", "RX", 45000.00, true));
        carsStore.add(new Product("Suzuki", "Compact cars and SUVs", "Swift", 15000.00, true));
        carsStore.add(new Product("Volvo", "Swedish safety and luxury", "XC90", 70000.00, false));
        carsStore.add(new Product("Nissan", "Japanese reliability and innovation", "Altima", 25000.00, true));
        carsStore.add(new Product("Volkswagen", "German engineering and design", "Golf", 30000.00, false));
        carsStore.add(new Product("Peugeot", "French style and performance", "308", 35000.00, true));
        carsStore.add(new Product("Mitsubishi", "Japanese engineering and technology", "Outlander", 28000.00, true));
        carsStore.add(new Product("Ford", "American muscle", "Mustang", 35000.00, true));


    }
}

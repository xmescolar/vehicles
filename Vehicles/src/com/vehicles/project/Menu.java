package com.vehicles.project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Exception;

public class Menu {
	
	private static int type_Vehicle() {
        // Introducing transport option: Bikes or Cars.
        int type;

        Scanner in_type = new Scanner(System.in);
        System.out.println("What kind of vehicle ? [1. Bike / 2. Car]: ");
        type = in_type.nextInt();
        
        return type;
    }
	
	private static String type_String(String message) {
		String string;
		// Demanding String data.
		
		Scanner in_typeS = new Scanner(System.in);
		System.out.println(message);
		string = in_typeS.nextLine();
		
		return string;
	}
    private static String type_wheel_brand_back() {
        //Declaration of variables.
        String wheel_brand_back;

        //Introducing back wheel brand Car.
        System.out.println("Introduce back wheel brand: ");
        Scanner in_wheel_brand_back = new Scanner(System.in);
        wheel_brand_back = in_wheel_brand_back.nextLine().toUpperCase();
        
        return wheel_brand_back;
    }

    private static String type_wheel_brand_front() {
        //Declaration of variables.
        String wheel_brand_front;

        //Introducing back wheel brand Car.
        System.out.println("Introduce front wheel brand: ");
        Scanner in_wheel_brand_front = new Scanner(System.in);
        wheel_brand_front = in_wheel_brand_front.nextLine().toUpperCase();
           
        return wheel_brand_front;
    }

    public static Double type_wheel_diameter_back() {
        //Declaration of variables.
        Double wheel_diameter_back;

        //Introducing wheel diameter Car.
        System.out.println("Introduce back wheel diameter: ");
        Scanner in_wheel_diameter_back = new Scanner(System.in);
        wheel_diameter_back = in_wheel_diameter_back.nextDouble();
           
        return wheel_diameter_back;
    }

    public static Double type_wheel_diameter_front() {
        //Declaration of variables.
        Double wheel_diameter_front;

        //Introducing front wheel diameter Car.
        System.out.println("Introduce front wheel diameter: ");
        Scanner in_wheel_diameter_front = new Scanner(System.in);
        wheel_diameter_front = in_wheel_diameter_front.nextDouble();
            
        return wheel_diameter_front;
    }

    static boolean testing_plate(String plate) {
        //Declaration of variables.
        int count_letters = 0;
        int count_numbers = 0;

        char char_plate;
        boolean testing = true;

        while (testing) {

            for (int i = 0; i < plate.length(); i++) {
                //Extracting character by character.
                char_plate = plate.charAt(i);

                 //Testing [3] letters in Car plate.
                 if (((char_plate == 'A') || (char_plate == 'B') || (char_plate == 'C') || (char_plate == 'D') || (char_plate == 'E')
                     || (char_plate == 'F') || (char_plate == 'G') || (char_plate == 'H') || (char_plate == 'I') || (char_plate == 'J')
                     || (char_plate == 'K') || (char_plate == 'L') || (char_plate == 'M') || (char_plate == 'N') || (char_plate == 'O')
                     || (char_plate == 'P') || (char_plate == 'Q') || (char_plate == 'R') || (char_plate == 'S') || (char_plate == 'T')
                     || (char_plate == 'U') || (char_plate == 'V') || (char_plate == 'W') || (char_plate == 'X') || (char_plate == 'Y')
                     || (char_plate == 'Z'))
                    && count_letters < 3) {
                        testing = true;
                        count_letters++;

                     //Testing [4] numbers in Car plate.
                   } else if (((char_plate == '0') || (char_plate == '1') || (char_plate == '2') || (char_plate == '3') ||
                (char_plate == '4') || (char_plate == '5') || (char_plate == '6') || (char_plate == '7') ||
                (char_plate == '8') || (char_plate == '9')) && (count_numbers < 4)) {
                    testing = true;
                    count_numbers++;
                } else {
                          System.out.println("The plate format it's wrong.");
                          return false;
                }
            }

            return true;
        }

        return false;
    }

	public static void load_bike(Bike bike) {
        
		//Declaration of variables.
		List<Wheel> wheels = new ArrayList<Wheel>();
        Wheel front_Wheel, back_Wheel;
        
        String bike_plate, bike_brand, bike_color;

        String front_wheel_brand, back_wheel_brand;

        double front_wheel_diameter, back_wheel_diameter;
    
        do { // Typing and testing Car plate.	
        	// Format of plate [9999ABC]: 4 numbers and 3 letters.	
        	bike_plate = type_String("Type a plate: [9999ABC]: "); // Vehicle plate.		
        	
        } while (!testing_plate(bike_plate));
        
    	bike_brand = type_String("Introduce brand: "); // Vehicle brand.
    	bike_color = type_String("Type color: "); 	 // Vehicle color.
		
        //Building new Car with some attributes: brand, color and plate.
        bike = new Bike(bike_plate,bike_brand,bike_color);
   //     System.out.println("A new bike it's created. Values of bike: " + bike.plate + " " + bike.brand + " " + bike.color);

        //Adding attributes to back wheel 1: brand and diameter.
        back_wheel_brand = type_wheel_brand_back();
        back_wheel_diameter = type_wheel_diameter_back();
        while((back_wheel_diameter < 0.4)||(back_wheel_diameter > 4)) {

            System.out.println("Diameter not correct. Please introduce diameter again.");
            back_wheel_diameter = type_wheel_diameter_back();
        }

        //Adding attributes to front wheel 1: brand and diameter.
        front_wheel_brand = type_wheel_brand_front();
        front_wheel_diameter = type_wheel_diameter_front();
        while((front_wheel_diameter < 0.4)||(front_wheel_diameter > 4)){
            System.out.println("Diameter not correct. Please introduce diameter again.");
            front_wheel_diameter = type_wheel_diameter_front();
        }

          
        front_Wheel = new Wheel(front_wheel_brand, front_wheel_diameter);
        back_Wheel = new Wheel(back_wheel_brand, back_wheel_diameter);
        
        wheels.add(front_Wheel);
        wheels.add(back_Wheel);
        
        try {
            //Adding front wheel.
        	bike.addTwoWheels(wheels);
          }
        catch (Exception e) {

            System.out.println("No wheels adding.");
        }

        System.out.println(bike.toString());

     }
	
	
	public static void load_car(Car car) {
	
	        //Declaration of variables.
	        List<Wheel> wheels = new ArrayList<Wheel>();
	        List<Wheel> front_Wheels = new ArrayList<Wheel>(); 
	        List<Wheel> back_Wheels = new ArrayList<Wheel>(); 
	        
	        //Declaration of variables
	        Wheel front_Wheel1, front_Wheel2;
	        Wheel back_Wheel1, back_Wheel2;
	             
	        //Declaration of variables.
	        String car_plate = "", car_brand = "", car_color = "";

	        //Declaration of variables.
	        String back_wheel_brand1, back_wheel_brand2;
	        String front_wheel_brand1, front_wheel_brand2;

	        //Declaration of variables.
	        double back_wheel_diameter1, back_wheel_diameter2;
	        double front_wheel_diameter1, front_wheel_diameter2;
	            
	        do { // Typing and testing Car plate.
	        	// Format of plate [9999ABC]: 4 numbers and 3 letters.
	        	car_plate = type_String("Type a plate: [9999ABC]: "); // Vehicle plate.
	        	 
	        } while (!testing_plate(car_plate));

			car_brand = type_String("Introduce brand: "); // Vehicle brand.
    		car_color = type_String("Type color: "); 	 // Vehicle color.
		
	        //Building new Car with some attributes: brand, color and plate.
	        car = new Car(car_plate,car_brand,car_color);

	        //Adding attributes to back wheel 1: brand and diameter.
	        back_wheel_brand1 = type_wheel_brand_back();
	        back_wheel_diameter1 = type_wheel_diameter_back();
	        while((back_wheel_diameter1 < 0.4)||(back_wheel_diameter1 > 4)) {
	            System.out.println("Diameter not correct. Please introduce diameter again.");
	            back_wheel_diameter1 = type_wheel_diameter_back();
	        }

	        //Adding attributes to back wheel 2: brand and diameter.
	        back_wheel_brand2 = type_wheel_brand_back();
	        back_wheel_diameter2 = type_wheel_diameter_back();
	        while((back_wheel_diameter2 < 0.4)||(back_wheel_diameter2 > 4)){
	            System.out.println("Diameter not correct. Please introduce diameter again.");
	            back_wheel_diameter2 = type_wheel_diameter_back();
	        }

	        //Adding attributes to front wheel 1: brand and diameter.
	        front_wheel_brand1 = type_wheel_brand_front();
	        front_wheel_diameter1 = type_wheel_diameter_front();
	        while((front_wheel_diameter1 < 0.4)||(front_wheel_diameter1 > 4)){
	            System.out.println("Diameter not correct. Please introduce diameter again.");
	            front_wheel_diameter1 = type_wheel_diameter_front();
	        }

	        //Adding attributes to front wheel 2: brand and diameter.
	        front_wheel_brand2 = type_wheel_brand_front();
	        front_wheel_diameter2 = type_wheel_diameter_front();
	        while((front_wheel_diameter2 < 0.4)||(front_wheel_diameter2 > 4)){
	            System.out.println("Diameter not correct. Please introduce diameter again.");
	            front_wheel_diameter2 = type_wheel_diameter_front();
	        }

	        try {
	            //Adding wheels
	        	
	        	 front_Wheel1 = new Wheel(front_wheel_brand1,front_wheel_diameter1);
	        	 front_Wheel2 = new Wheel(front_wheel_brand2,front_wheel_diameter2);
	        	 back_Wheel1 = new Wheel(back_wheel_brand1,back_wheel_diameter1);
	        	 back_Wheel2 = new Wheel(back_wheel_brand2,back_wheel_diameter2);
	        	
	        	 front_Wheels.add(front_Wheel1);
	        	 front_Wheels.add(front_Wheel2);
	        	 
	        	 back_Wheels.add(back_Wheel1);
	        	 back_Wheels.add(back_Wheel2);
	        	 
	             car.addWheels(front_Wheels,back_Wheels);	          
	        }
	        catch(Exception e) {

	            System.out.println("No front wheels adding.");
	        }

	        System.out.println(car.toString());
		        
	}
	
    public static void main(String[] args) { // throws Exception{

       int response = (int) type_Vehicle();
   
       switch(response) {
            case 1:
            	Bike bike = null;
            	            	
            	System.out.println("BIKES...");
            	load_bike(bike); // choosing bike.
            	
            break;
            case 2:
            	Car car = null; 
            	
            	System.out.println("CARS...");
             	load_car(car);  // choosing car.
             	
            break;
            default:
                System.out.println("Invalid option. Type again.");
            break;
        }
    }

}

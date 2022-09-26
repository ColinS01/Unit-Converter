import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner starting_unit = new Scanner(System.in);
        Scanner final_unit = new Scanner(System.in);
        Scanner distance = new Scanner(System.in);

        System.out.println("***Welcome to Metric Converter***");
        System.out.println("Please Select a starting Unit...");
        System.out.println("0.) Exit program");
        System.out.println("1.) Miles");
        System.out.println("2.) Kilometers");
        System.out.println("3.) Feet");
        System.out.println("4.) Meters");
        System.out.println("");
        int start = starting_unit.nextInt();

        if (start != 0){
            System.out.println("");
            System.out.println("Please Select a final Unit... (Enter corisponding ");
            System.out.println("1.) Miles");
            System.out.println("2.) Kilometers");
            System.out.println("3.) Feet");
            System.out.println("4.) Meters");
            int finish = final_unit.nextInt();
            System.out.println("");
            System.out.println("Enter distance to convert: ");
            double starting_distance = distance.nextDouble();
            double final_distance = 0;  
            
            if (start == 1){
                if (finish == 1){
                    final_distance = starting_distance;
                    System.out.println(starting_distance + " miles is equal to " + final_distance + " miles");
                }
                else if (finish == 2){
                    final_distance = starting_distance * 1.61;
                    System.out.println(starting_distance + " miles is equal to " + final_distance + " kilometers");
                }
                else if (finish == 3){
                    final_distance = starting_distance * 5280;
                    System.out.println(starting_distance + " miles is equal to " + final_distance + " feet");
                }
                else if (finish == 4){
                    final_distance = starting_distance * 16009.34;
                    System.out.println(starting_distance + " miles is equal to " + final_distance + " meters");
                }
                else{
                    System.out.println("Sorry youve entered an invalid unit, please try one of the options listed");
                    main(args);
                }
                System.out.println("");
                main(args);
            }
            else if (start == 2){
                if (finish == 1){
                    final_distance = starting_distance * .62;
                    System.out.println(starting_distance + " kilometers is equal to " + final_distance + " miles");
                }
                else if (finish == 2){
                    final_distance = starting_distance;
                    System.out.println(starting_distance + " kilometers is equal to " + final_distance + " kilometers");
                }
                else if (finish == 3){
                    final_distance = starting_distance * 3280.84;
                    System.out.println(starting_distance + " kilometers is equal to " + final_distance + " feet");
                }
                else if (finish == 4){
                    final_distance = starting_distance * 1000;
                    System.out.println(starting_distance + " kilometers is equal to " + final_distance + " meters");
                }
                else{
                    System.out.println("Sorry youve entered an invalid unit, please try one of the options listed");
                    main(args);
                }
                System.out.println("");
                main(args);
            }
            else if (start == 3){
                if (finish == 1){
                    final_distance = starting_distance * 0.000189394;
                    System.out.println(starting_distance + " feet is equal to " + final_distance + " miles");
                }
                else if (finish == 2){

                    final_distance = starting_distance * 0.0003048;
                    System.out.println(starting_distance + " feet is equal to " + final_distance + " kilometers");
                }
                else if (finish == 3){
                    final_distance = starting_distance;
                    System.out.println(starting_distance + " feet is equal to " + final_distance + " feet");
                }
                else if (finish == 4){
                    final_distance = starting_distance * 0.3048;
                    System.out.println(starting_distance + " feet is equal to " + final_distance + " meters");
                }
                else{
                    System.out.println("Sorry youve entered an invalid unit, please try one of the options listed");
                    main(args);
                }
                System.out.println("");
                main(args);
            }
            else if (start == 4){
                if (finish == 1){
                    final_distance = starting_distance * 0.000621371;
                    System.out.println(starting_distance + " meters is equal to " + final_distance + " miles");
                }
                else if (finish == 2){
                    final_distance = starting_distance * .001;
                    System.out.println(starting_distance + " meters is equal to " + final_distance + " kilometers");
                }
                else if (finish == 3){
                    final_distance = starting_distance * 3.281;
                    System.out.println(starting_distance + " meters is equal to " + final_distance + " feet");
                }
                else if (finish == 4){
                    final_distance = starting_distance;
                    System.out.println(starting_distance + " meters is equal to " + final_distance + " meters");
                }
                else{
                    System.out.println("Sorry youve entered an invalid unit, please try one of the options listed");
                    main(args);
                }
                System.out.println("");
                main(args);
            }
        }
        else if (start == 0){
            System.exit(0);
        }
        


    }
}

package chik.fila;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void chickenmenu(){
        System.out.println("Welcome to Chik-Fila, what kind of Sandwhich can we get you?");
        System.out.println("");
        System.out.println("MENU");
        System.out.println("----------");
        System.out.println("fried - Fried Chicken Sandwich\n" +
                "grilled - Grilled Chicken Sandwich\n" +
                "bbq - BBQ Sandwich\n" +
                "southwestern - SouthWestern Chicken Sandwich\n" +
                "jamaican - Jamaican Jerk Chicken Sandwich \n" +
                "\n" +
                "Input You Selection Below:");

    }

    public static  void sidesmenu(){
        //Ask for Sides
        System.out.println("What kind of side would you like?");
        System.out.println("fruitcup - Fruit Cup\n" +
                "fries - French Fries\n" +
                "macncheese - Mac N Cheese\n" +
                "\n" +
                "Input You Selection Below:");
    }

    public static void main(String[] args) throws IOException {


        //base Order created
        ChikFilaSandwich order1 = new ChikFilaSandwich();

        //Scanner Created
        Scanner scanner1 = new Scanner(System.in);

        //display Menu
        chickenmenu();

        //Input assigned to variable
        String sandwhichChoice = scanner1.nextLine();

//loop until correct input
    while(!sandwhichChoice.equals("fried") || sandwhichChoice.equals("grilled")|| sandwhichChoice.equals("bbq") ||
            sandwhichChoice.equals("southwestern") || sandwhichChoice.equals("jamaican") ){

        sandwhichChoice = scanner1.nextLine();

        if(sandwhichChoice.equals("fried") || sandwhichChoice.equals("grilled")|| sandwhichChoice.equals("bbq") ||
                sandwhichChoice.equals("southwestern") || sandwhichChoice.equals("jamaican")){
            break;
        }
        else{
            System.out.println("Sorry Please Input the correct menu item:");
        }

    }//end of loop


// Type of order1 created below

            if (sandwhichChoice.equals("fried")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("grilled")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("bbq")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("southwestern")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("jamaican")) {
                order1.orderSandwich(sandwhichChoice);
            }

            
            
            //Sides Menu Displayed
        System.out.println("-------------");
        sidesmenu();
        //Get Input for Sides
        Scanner scan = new Scanner(System.in);
        String userinput = scan.nextLine();

        //check for correct input
        while(!userinput.equals("fruitcup") || userinput.equals("fries") || userinput.equals("macncheese")){
            //Get Input for Sides

            userinput = scan.nextLine();

            if(userinput.equals("fruitcup") || userinput.equals("fries") || userinput.equals("macncheese")){
                break;
            }else{
                System.out.println("Sorry Please Input the correct menu item:");

            }
        }//end of loop



            //Loop for sides selection
            if (userinput.equals("fruitcup")) {

                order1.orderSides("fruitcup");

            } else if (userinput.equals("fries")) {

                order1.orderSides("fries");

            } else if (userinput.equals("macncheese")) {

                order1.orderSides("macncheese");

            }
                else {
                    System.out.println("Order Complete");
            }



    } // end of main

} // end of class

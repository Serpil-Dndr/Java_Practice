package Practice_Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
       calculateShopping(4);

    }
    public static int calculateShopping(int num){
        Scanner scan= new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.println("What do you want to today? \n 1-Shopping \n 2-Calculate Total");
            int preference = scan.nextByte();
            if (preference==1) {
                String products = "Select Products: \\n1-Ekmek - 2 TL\\n2-Sut - 4 TL\\n Cikilolata - 1 TL";
                System.out.println(products);
                int productsChoice = scan.nextInt();
                if (productsChoice == 1) {
                    total += 2;


                } else if (productsChoice == 2) {
                    total += 4;
                } else if (productsChoice == 3) {
                    total += 1;
                } else {
                    System.out.println("Please enter correct number!!!!");
                }
            }else{
                    break;
                }

            }
        System.out.println("Totals: "+total+ "CAD");

        return total;
    }
    }

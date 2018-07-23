import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner sca = new Scanner(System.in);
        Random rand = new Random();
        String foodName;
        double foodPrice;
        int foodQuantity;
        boolean taxable;
        double taxRate;
       // double subTotal;
        double total;
        // generate the tax code from o-3 use the if else stetment to pick on of the states instade of switch using random selector
        int taxCode = rand.nextInt(4);
        System.out.println("My current tax code is: " + taxCode);
        if (taxCode == 1) {
            //frist change the % number by * with 100 or  use rand that multipys by 10
            taxRate = 0.06;

        } else if (taxCode == 2) {
            taxRate = 0.053;
        } else if (taxCode == 3) {
            taxRate = 0.0575;
        } else {
            taxRate = 0.05;
            // this value needs to be stored to be displayed
          //  taxRate = rand.nextDouble();
        }

        //Delcare and initialize computation variables
                String result = "";//what ever is going to came out
                double subTotal = 0.0;
                double taxableTotal = 0.0;

             //   outputLine("================================================");
        // Inside the while loop computional part /calculation is also done while the persone keeps adding the item,quantiy and price
        // and by that sub tatal, salesTax and total amount are also calculated

        String userInput = ""; // what ever the user is going to put
        System.out.println("Welcome to the Behind-The-Door Break Room Cafe!");
        while (!userInput.contains("quit")) {
            System.out.println("Enter a food item you want: ");
             foodName = sca.next();

            System.out.println("Price: ");
            foodPrice = sca.nextDouble();

           // System.out.println("Taxable? True or False: ");
           // taxable = sca.nextBoolean();

            System.out.println("Quantity: ");
            foodQuantity = sca.nextInt();

            // Use a string formatter to get 2 decimal places of each food price
           String formatPrice = String.format("%.02f", foodPrice);
            // this inputs needs to be stored while you are adding new to do that so this is like the i++ and disply it perpose
            // our expection is the result  and we need to add this to the old one

//            result += foodName + "\t\t" + foodQuantity + "\t\t\t$" + formatPrice + "\t\t" + taxable + "\n";
//
//            // now you want the calculation of the sub total to be done  for every food price and foodQuantity using the  i++
//
//            // this is to calculate subTotal=(p*Q) so the next line wil do this and sum it up
//            sub cost
            subTotal+= (foodPrice * foodQuantity);
            System.out.println("Sub Total is :" + subTotal);
           //esult += foodName + "\t\t" + foodQuantity + "\t\t\t$" + formatPrice + "\t\t" + taxable + "\n";

//            // taxable total is  the sum of the sub total that are taxable
//            // Check if the taxable field is true to add to the taxableTotal
//            if (taxable == true) {
//                taxableTotal += (foodPrice * foodQuantity);
//            }
// this last line helps to stop the user ans aske if they want to continou or quit
            System.out.println("Do you want to add another item? (Type 'quit' to exit): ");
            userInput = sca.next();
//        }
//          // if the items are taxable  we will have the taxableTotal iteam from the if loop and we can multiply it  by the taxRate to get sa tax

        }
        //  the sales tax for ONLY taxable items
        double salesTax = subTotal*taxRate;
        System.out.println("sales Tax " + salesTax);
        //  the total amount (sales tax + sub total)
        double totalAmount = salesTax + subTotal;
        System.out.println("Total Amount " + totalAmount);

    }
}
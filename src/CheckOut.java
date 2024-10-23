import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0;
        boolean done = false;

        do {
            total = total + SafeInput.getRangedDouble(input, "Enter the price of your item", 0.50, 10.0);
            System.out.println("Your price is updated to " + total + ".");
            done = SafeInput.getYNConfirm(input,"Would you like to input another item?");
        }while(done);
        System.out.println("The total price is: " + total);
    }
}

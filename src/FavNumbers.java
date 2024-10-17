import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favNum = 0;
        double favDouble = 0;

        favNum = SafeInput.getInt(in,"Enter your favorite number");
        favDouble = SafeInput.getDouble(in,"Enter your favorite double value");
        System.out.println("Your favorite number is " + favNum);
        System.out.println("Your favorite double value is " + favDouble);
    }
}

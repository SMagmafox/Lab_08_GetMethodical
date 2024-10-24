import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn, ucid, menuChoice = "";
        String SSNRx = "^\\d{3}-\\d{2}-\\d{4}$";
        String UCIDNumRx = "^(M|m)\\d{5}";
        String menuRx = "^[OoSsVvQq]$";

        ssn=SafeInput.getRegExString(in,"Enter your SSN", SSNRx);
        System.out.println("Your SSN is "+ssn);
        ucid=SafeInput.getRegExString(in,"Enter your UCID", UCIDNumRx);
        System.out.println("Your UCID is "+ucid);
        menuChoice=SafeInput.getRegExString(in,"Enter your menu choice", menuRx);
        System.out.println("You chose "+menuChoice + " from the menu.");
    }
}

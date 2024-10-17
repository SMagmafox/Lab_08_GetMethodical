import java.util.Scanner;

public class GetUsername
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String username = "";
        username =SafeInput.getNonZeroLenString(in, "Enter your username");
        System.out.println("You said your username was " + username);
    }
}

import java.util.Scanner;

public class SafeInput
{

    /**
     * gets a string from the user using the console, cant be empty
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a String of at least 1 character in length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do{
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.isEmpty())
                System.out.println("You must enter at least one character!");

        }while(retVal.isEmpty());
        return retVal;
    }
}

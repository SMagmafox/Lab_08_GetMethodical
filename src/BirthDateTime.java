import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(input,"enter your birth year", 1950,2015);
        birthMonth = SafeInput.getRangedInt(input,"enter your birth month", 1,12);
        birthDay = SafeInput.getRangedInt(input,"enter your birth day", 1,31);
        birthHour = SafeInput.getRangedInt(input,"enter your birth hour", 1,23);
        birthMinute = SafeInput.getRangedInt(input,"enter your birth minute", 1,59);

        System.out.println("You said you were born on " + birthMonth + "-" + birthDay + "-" + birthYear + " at " + birthHour+":"+birthMinute);
    }
}

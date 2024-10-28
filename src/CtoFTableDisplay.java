public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double farenheight = 0;
        double celsius = 0;
        celsius = 27;
        farenheight =CtoF(celsius);
        System.out.print("Celsius: " + celsius + "   ||   Farenheight: " + farenheight);
    }

    public static double CtoF(double Celsius)
    {
        double farenheight = Celsius * 1.8 +32;
        return farenheight;
    }
}

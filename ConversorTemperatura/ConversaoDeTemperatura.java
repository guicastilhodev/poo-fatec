import java.util.Scanner;

public class ConversaoDeTemperatura 
{
   public static void main (String args[]) 
   {
   Scanner input = new Scanner(System.in);
   
   double f;
   double c;
   
   System.out.print ("Digite a temperatura: ");
   f = input.nextDouble();
   
   c = (f-32) * 5/9;
   System.out.printf("%.2f Fahrenheit sao %.2f Celsius", f, c); 
   
   }
}
import java.util.Scanner;

public class ConsumoEnergia
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      double consumo, totalFatura = 10, excessoConsumo = 0;
      
      System.out.println("Digite o consumo: ");
      consumo = input.nextDouble();
      
      
      if (consumo <= 50)
      {
         System.out.printf("O total da sua fatura é de %.2f",totalFatura);
      }
      else if (consumo <= 100)
      {
         excessoConsumo = consumo - 50;
         totalFatura += (excessoConsumo * 0.20);
         System.out.printf("O total da sua fatura é de %.2f",totalFatura);
      }
      else if (consumo <= 200)
      {
         excessoConsumo = consumo - 100;
         totalFatura += (excessoConsumo * 0.25) + (50*0.20);
         System.out.printf("O total da sua fatura é de %.2f",totalFatura); 
      }
      else
      {
         excessoConsumo = consumo - 200;
         totalFatura += (excessoConsumo * 0.35) + (100 * 0.25) + (50 * 0.20);
         System.out.printf("O total da sua fatura é de %.2f",totalFatura); 
      }                      
   }

}
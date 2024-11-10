import java.util.Scanner;

public class CalculadoraInvestimento {
   
   public static void main (String args []) {
      Scanner input = new Scanner (System.in);
      int i;
      double capital, taxa, investimento;
     
      System.out.println("Digite o valor investido: ");
      capital = input.nextDouble();
      System.out.println("Digite a taxa de juros: ");
      taxa = input.nextDouble() / 100;
     
      investimento = capital;
      for (i=1; i <= 12; i++) {
      investimento *= (1+taxa);
      System.out.printf("Mes %d: %.2f\n", i ,investimento);
         
      }
   }  
} 
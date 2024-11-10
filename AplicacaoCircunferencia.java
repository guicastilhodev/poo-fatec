import java.util.Scanner;

class AplicacaoCircunferencia
{
   
   public static void main (String args[])
   {
      Circunferencia circ = new Circunferencia();
      Scanner input = new Scanner(System.in);
      double raio;
      
      System.out.print("Digite o raio: ");
      raio = input.nextDouble();
      circ.setRaio(raio);
      
      System.out.printf("\nO diametro do circulo e %.2f", circ.getDiametro());
      System.out.printf("\nA area do circulo e %.2f", circ.getArea());
      System.out.printf("\nO perimetro do circulo e %.2f", circ.getPerimetro());
      
    }
}
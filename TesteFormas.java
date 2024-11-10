public class TesteFormas 
{
   public static void main(String args[])
   {
      Circulo c = new Circulo(5);
      c.exibeInfo();
      System.out.println("-".repeat(20));
      
      Retangulo r = new Retangulo(3, 4);
      r.exibeInfo();
      System.out.println("-".repeat(20));
      
      Triangulo t = new Triangulo(4,4);
      t.exibeInfo();
      System.out.println("-".repeat(20));
      
   }
   
}
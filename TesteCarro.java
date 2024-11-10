public class TesteCarro 
{
   public static void main (String args[])
   {
      Carro carro;
      carro = new Carro ("Ferrari", "ABC123", 2019, 2020, 2, 1000000);
      
      carro.imprime();
      carro.deprecia(2.4f);
      carro.imprime();
      
   }
   
}
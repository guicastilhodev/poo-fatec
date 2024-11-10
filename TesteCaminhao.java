public class TesteCaminhao 
{
   public static void main(String[] args)
   {
      Caminhao caminhao;
      caminhao = new Caminhao("Volvo", "XYZ987", 2019, 5000, 4, 350000);
      
      caminhao.imprime();
      caminhao.deprecia(2.4f); 
      caminhao.imprime();
   }
}

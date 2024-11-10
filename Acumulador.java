public class Acumulador 
{
   private double soma, media;
   private int contagem;
   
   public Acumulador()
   {
      soma = 0;
      contagem = 0;
   }
   
   public void totalize(int valor)
   { 
      soma += valor;
      contagem++;
   } 
   
   public void informeTotal()
   {
      System.out.println(soma);
   }
   
   public void informeContagem()
   {
      
      System.out.println(contagem);
   }
   
   public void fornecaMedia()
   {
      if (contagem == 0)
         System.out.println("Nenhum valor foi contabilizado");
      else
      {
      media = soma / contagem;
      System.out.println(media);
      }
   }
   
   
   
}
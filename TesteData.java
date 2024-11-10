public class TesteData 
{
   public static void main (String args [])
   {
      Data data1, data2, data3;
      data1 = new Data (29,2,2023);
      data2 = new Data (2023);
      data3 = new Data (12,2026);
      
      System.out.println ("Hoje é " + data1.toString() + " ingressei no primeiro semestre de " + data2.getAno() + " e me formarei em " + data3.getMes() +"/" + data3.getAno());
   }

}
public class Data 
{
   private int mes;
   private int dia; 
   private int ano;
   private boolean bissexto;
   
   public Data (int d, int m, int a)
   {
      setData(d, m, a);
   }
   
   public Data (int m, int a)
   {
      setData(1,m,a);
   }
   
   public Data (int a)
   {
      setData(1,1,a);
   }
   
   public int getDia ()
   {
      return dia;
   }
   
   public int getMes ()
   {
      return mes;
   }
   
   public int getAno ()
   {
      return ano;
   }
   
   public void setData (int d, int m, int a)
   {
      if (m > 0 && m <= 12)
         mes = m;
      else 
      {
         mes = 1;
         System.out.println("Mês " + m + " inválido. Configurado mês = 1.");
      }
      ano = a;
      dia = checkDia (d);
   }
   
   private int checkDia (int diaTeste)
   {
      checkBissexto(ano);
      
      int[] diasMes;
      if (bissexto)
      {
         diasMes = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
      }
      else 
      {
         diasMes[ = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
      }
      
      if (diaTeste > 0 && diaTeste <= diasMes[mes])
         return diaTeste;
      System.out.println("Dia " + diaTeste + "inválido. Configurado dia = 1.");
      return 1;
   }
   
   public String toString()
   {
      return dia + "/" + mes + "/" + ano;
   }
   
   private void checkBissexto (int anoTeste)
   {
      bissexto = (anoTeste % 4 == 0 && (anoTeste % 100 != 0 || anoTeste % 400 == 0));
   }
}
         
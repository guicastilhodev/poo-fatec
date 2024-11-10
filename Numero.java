class Numero 
{
   private int num;
   
   public Numero(int n)
   {
      setNumero(n);
   } 
   
   public void setNumero (int n)
   {
      if (n >= 0)
         num = n;
      else 
         num = 1;     
   }
   
   public int getNumero()
   {
      return num;
   } 
   
   public int getFatorial()
   {
     return calcularFatorial(num);   
   }
   
   private int calcularFatorial(int n)
   {
      if (n == 0 || n == 1)
         return 1;
         
      return n * calcularFatorial(n-1);
   }
   
   public boolean isPar()
   {
      return num % 2 == 0;
   }
   
   public boolean isPrimo()
   {
      if (num <= 1)
         return false;
      
      for (int i = 2; i < num; i++)
      {
         if (num % i == 0)
            return false;
      }
      
      return true;
         
   }  
     
}
   
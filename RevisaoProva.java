public class RevisaoProva 
{
   public static void main (String args[])
   {
      int y = 0, x;
      while (y!=6)
      {
         y++;
         if (y>0)
            System.out.print(y);
         else 
            {
               x = -1*y;
               System.out.print(x);
            }
      }
   }
}
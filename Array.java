import java.util.Scanner;
public class Array 
{
    public static void main(String[] args) 
    {
        int elementos[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int numProcurado;
        boolean encontrado = false;
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número a ser procurado: ");
        numProcurado = read.nextInt();

        for (int i = 0; i < elementos.length; i++)
        {
            if (numProcurado == elementos[i])
            {
                System.out.println("O número " + numProcurado + " foi encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
            System.out.println("O número não foi encontrado no array");
    }
}

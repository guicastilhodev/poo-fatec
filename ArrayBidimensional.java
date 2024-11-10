import java.util.Scanner;
public class ArrayBidimensional {
    public static void main(String[] args) {
        int estante[][]= new int[4][3];
        Scanner read = new Scanner(System.in);

        System.out.println("Digite os valores para o compartimento: ");

        for (int i = 0; i < estante.length; i++)
        {
            System.out.println("Prateleira " + i);
            for (int j = 0; j < estante[i].length; j++)
            {
                System.out.print("Compartimento " + j + ": ");
                estante[i][j] = read.nextInt();
            }
        }

        System.out.println("\nValores das peças por prateleira: ");
        for (int i = 0; i < estante.length; i++)
        {
            System.out.println("\nPrateleira " + i);
            for (int j = 0; j < estante[i].length; j++)
            {
                System.out.println("Compartimento " + j + ": " + estante[i][j]);
            }
        }
        
    }
}

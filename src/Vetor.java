import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println ("Qual tamanho do vetor?");
        n = in.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i<=n; i++){
            System.out.println("Entre com os valores");
            vetor[i] = in.nextInt();
        }
        for (int i = 0; i<=n;i++){
            System.out.println(vetor[i]);
        }
        in.close();
    }
}
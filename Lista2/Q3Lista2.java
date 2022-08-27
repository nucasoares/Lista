import java.util.Scanner;

public class Q3Lista2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int numeros[];
        int qElementos = 0;
        
        System.out.println("Quantos números você quer imprimir?");
        qElementos = sc.nextInt();
        
        numeros = new int[qElementos];
        
        for(int i = 0; i < numeros.length; i++) {
        	numeros[i] = (int)(Math.random()*100);
        	System.out.println(numeros[i]);
        }
        System.out.println("Pronto.");
        System.out.println("A ordem inversa dos números impressos é: ");
        
        for(int i = numeros.length-1; i >= 0; i--) {
        	System.out.println(numeros[i]);
        
        }

        sc.close();
	}
}

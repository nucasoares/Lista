import java.util.Scanner;

public class Q6Lista2 {

	public static void main(String[] args) {
		Scanner array = new Scanner(System.in);
		
        int numeros[];
        int qElementos=0;
        
        
        System.out.println("Quantos números aleatórios você quer imprimir?");
        qElementos = array.nextInt();
        
        numeros = new int[qElementos];
        
        System.out.println("Os números escolhidos são: ");
        for(int i = 0; i < numeros.length; i++) {
        	numeros[i] = (int)(Math.random()*100);
        	System.out.println(numeros[i]);
        }
        
        System.out.println("Desses números são ímpares:");
        
        for(int i = 0; i < numeros.length; i++) {
        	if(numeros[i]%2==0)
        		System.out.println(numeros[i]);
        }

		array.close();

	}

}

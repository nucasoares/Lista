import java.util.Scanner;

public class Q2Lista2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int [] vetor = new int [10];
		System.out.println("Vamos imprimir 10 números em ordem inversa");
		for(int i = 0; i < vetor.length; i++){
			System.out.println("Digite um número");
			vetor[i] = num.nextInt();	
		}
		System.out.println("A ordem inversa dos números digitados é: ");
		for(int i = vetor.length-1; i >= 0; i--){
			System.out.println(vetor[i]);
			
			num.close();
		}	
	}

}

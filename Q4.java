import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("De dois números vamos dizer qual é o maior entre eles");
		
		System.out.println("Digite um número inteiro: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int n2 = sc.nextInt();
		
		
		if (n1 > n2) {
			System.out.println("O primeiro número é maior que o segundo");
			}
			else {
			System.out.println("O segundo número é maior que o primeiro");
		}
			sc.close();
	}

}

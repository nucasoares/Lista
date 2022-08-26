import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("O número é paz ou impar?");
		System.out.println("Digite um número inteiro: ");
		int n = num.nextInt();
		
		if (n%2 == 0) {
			System.out.println("O número " + n + " é par");
		} else {
			System.out.println("O número " + n + " é impar");
		}
		num.close();

	}

}

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int i = num.nextInt();
		
		System.out.println("Digite um número long:");
		long l = num.nextLong();
		
		System.out.println("Digite um número float:");
		float f = num.nextFloat();
		
		
		System.out.println("o número inteiro digitado foi "+ i + ", O número long digitado foi "+ l + ", O número float digitado foi " + f);
		
		num.close();

	}

}

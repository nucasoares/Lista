import java.util.Scanner;

public class Q2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Vamos calcular seu IMC");
	
			System.out.println("Digite o seu peso: ");
			float peso = sc.nextFloat();
	
			System.out.println("Digite o seu altura: ");
			float altura = sc.nextFloat();
	
	
			float imc = peso / (altura*altura);
			//System.out.println("O valor do seu IMC é: " + imc);
			System.out.printf("O valor do seu IMC é: %.2f", imc);
	
			sc.close();

	}

}

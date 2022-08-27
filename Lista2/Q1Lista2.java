import java.util.Scanner;

public class Q1Lista2 {

	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
		float n5;
		
		System.out.print("Digite a primeira nota: ");
		n1 = nota.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		n2 = nota.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		n3 = nota.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		n4 = nota.nextFloat();
		
		System.out.print("Digite a quinta nota: ");
		n5 = nota.nextFloat();
		
		
		float media = (n1 + n2 + n3 + n4 + n5 )/5;
		System.out.print("A media é:" +media);
	}

}

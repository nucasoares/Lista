import java.util.Scanner;

public class Q3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vamos definir a área de um trapézio");
			
			System.out.println("Base maior: ");
			float bMaior = sc.nextFloat();
			
			System.out.println("Base menor: ");
			float bMenor = sc.nextFloat();
			
			System.out.println("Base altura: ");
			float altura = sc.nextFloat();
			
			float area = (((bMaior + bMenor)* altura)/2);
			
			System.out.println("A área do trapézio em cm² é:" + area);
			
			sc.close();
			

	}

}


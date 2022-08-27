import java.util.Scanner;

public class Q8Lista2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qNotas;
		float notas[];
		float resultado = 0;
		
		System.out.println("Quantas notas você deseja inserir?");
		qNotas = sc.nextInt();
		
		notas = new float[qNotas];
		
        System.out.println("As notas são: ");
        for(int i = 0; i < notas.length; i++) {
        	notas[i] = (int)(Math.random()*100);
        	System.out.println(notas[i]);
        }
        
		
		for(int i = 0; i < notas.length; i++) {
			resultado = resultado + notas[i];
		}
		
		System.out.println("A média aritmética das notas é " + resultado/notas.length);
			
		
		sc.close();

	}

}

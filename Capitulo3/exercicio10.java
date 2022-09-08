import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Double raio,area;
		
		System.out.println("digite a medida do raio:");
		raio=teclado.nextDouble();
		
		
		area = 3.14*raio*raio;
		
		System.out.println("A area do triangulo é:"+area);
		
		
		
		
		
		
		
		
		teclado.close();

	}

}

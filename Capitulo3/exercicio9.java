import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int base,altura,area;
		
		System.out.println("digite a medida da base:");
		base=teclado.nextInt();
		
		System.out.println("digite a medida da altura:");
		altura=teclado.nextInt();
		
		area = (base*altura)/2;
		
		System.out.println("A area do triangulo é:"+area);
		
		
		
		
		
		
		
		
		teclado.close();

	}

}

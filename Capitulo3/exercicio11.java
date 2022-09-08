import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double base,quadrado,cubo,raiz2,raiz3;
		
		System.out.println("digite um número:");
		base=teclado.nextInt();
		
		quadrado= base*base;
		cubo=Math.pow(base,3);
		raiz2= Math.sqrt(base);
		raiz3=Math.cbrt(base);
		
		System.out.println(" é:"+quadrado);
		System.out.println(" é:"+cubo);
		System.out.println(" é:"+raiz2);
		System.out.println(" é:"+raiz3);
		
		
		
		
		
		
		
		
		teclado.close();

	}

}

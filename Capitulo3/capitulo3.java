import java.util.Scanner;

public class capitulo3 {

	public static void main(String[] args) {
		int n1,n2,n3,n4,som;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite seus números:");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		n3=teclado.nextInt();
		n4=teclado.nextInt();
		
		som = n1+n2+n3+n4;
		
		System.out.printf("A soma é: %d",som);
		
		
		
		
		
		teclado.close();

	}

}

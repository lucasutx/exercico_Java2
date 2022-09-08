import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			
			double not1,not2,not3,med;
			
			System.out.println("Digite suas notas:");
			not1=teclado.nextDouble();
			not2=teclado.nextDouble();
			not3=teclado.nextDouble();
			
			med= (not1+not3+not2)/3;
			 System.out.printf("Sua media é: %.2f",med);
			
			
			teclado.close();

	}

}

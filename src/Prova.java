import java.util.Locale;
import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horas,thoras,opçmen;
		double vph,custo,caro1,caro2;
		char opçao;
		
		thoras=0;
		custo=0;		
		
		System.out.print("Nome:");
		nome = sc.next();
		System.out.print("Horas trabalhadas:");
		horas = sc.nextInt();
		System.out.print("Valor por hora:");
		vph = sc.nextDouble();
		thoras=thoras + horas;
		custo = custo + (vph*horas);
		System.out.print("digitar outro(S/N)?");
		opçao = sc.next().charAt(0);
		
		


}
}


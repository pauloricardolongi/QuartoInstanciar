package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) thows ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Entre com os dados do Cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("data Nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		
		sc.close();
		
		

	}

}

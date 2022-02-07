import java.util.Scanner;

public class Git_Exercisi {
	  public static void main(String[] args) {
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  casDeProva nous = new casDeProva();
		  
		  System.out.println("Quans casos de prova vols?");
		  int casos_prova = scanner.nextInt();
		  nous.proves(casos_prova);

	  }
	   
}

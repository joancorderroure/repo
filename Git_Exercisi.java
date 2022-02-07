import java.util.Scanner;

public class Git_Exercisi {
	  public static void main(String[] args) {
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  //Creem un nou objecte
		  casDeProva nous = new casDeProva();
		  
		  //Preguntem els casos de prova
		  System.out.println("Quans casos de prova vols?");
		  int casos_prova = scanner.nextInt();
		  
		  //Fem un set del casos de prova
		  nous.setnCasosdeProva(casos_prova);
		  
		  //Fem el method proves que ens donaran les modes
		  nous.proves();

	  }
	   
}

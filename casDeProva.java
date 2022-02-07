import java.util.Scanner;

public class casDeProva {
	
	int nCasosDeProva;
	
	public void proves(int casos_prova) {
		
		Scanner scanner = new Scanner(System.in);
		int casosFets = 0;
		int numPosats = 0;
		
		int [][] mCasos = new int [casos_prova][];
		int [][] modes = new int [casos_prova][10];
		
		//Creem els arrays i emplenem els arrays
		
		while(casosFets <= casos_prova - 1) {
			System.out.println("Quants numeros vols posar?");
			int numPerPosar = scanner.nextInt();
			mCasos[casosFets] = new int[numPerPosar];
				while (numPosats <= numPerPosar - 1) {
					mCasos[casosFets][numPosats] = scanner.nextInt();
					numPosats++;
				}
		   casosFets++;
		   numPosats = 0;
	   }
		
		//Ara que tenim els arrays anem a fer les modes

		int modesFetes = 0;
		
		while (modesFetes <= casos_prova - 1) {
			int maximaDeVegades = 0;
			String moda = "";
			int l = 0;
			for(int i = 0; i < mCasos[modesFetes].length - 1;i++) {
				int vegadesRepetides = 0;
				for (int j = 0; j <= mCasos[modesFetes].length - 1;j++) {
					if(mCasos[modesFetes][i] == mCasos[modesFetes][j])
						vegadesRepetides++;
				}
				if(vegadesRepetides >= maximaDeVegades) {
					modes[modesFetes][l] = mCasos[modesFetes][i];
					maximaDeVegades = vegadesRepetides;
					l++;
					
				}
			}
			modesFetes++;
		}
		
		
		//Eliminar valors duplicats
		int [][] modesOrdenades = new int [casos_prova][10];

		for (int a = 0; a < modes.length; a++) {
	        int j = 0;
			for (int i=0; i < modes[a].length-1; i++){  
				if (modes[a][i] != modes[a][i+1]){
					modesOrdenades[a][j++] = modes[a][i];
				}  
			}  
			modesOrdenades[a][j++] = modes[a][modes[a].length-1];  
		}
		
		System.out.println("");

		for (int i = 0; i <= modesOrdenades.length - 1; i++) {
			for(int j = 0; j <= modesOrdenades[i].length - 1; j++) {
				if(modesOrdenades[i][j] != 0) {
					System.out.print(modesOrdenades[i][j] + " ");					
				}
			}
			System.out.println("");
	    }
		
		
		
	}
	
}


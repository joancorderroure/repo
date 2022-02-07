import java.util.Scanner;

public class casDeProva {
	
	int nCasosDeProva;
	
	public void setnCasosdeProva(int casos_prova) {
		// TODO Auto-generated method stub
		    this.nCasosDeProva = casos_prova;
	}
	
	public int getnCasosdeProva() {
	    return nCasosDeProva;
	}
	
	public void proves() {
		
		Scanner scanner = new Scanner(System.in);
		int casosFets = 0;
		int numPosats = 0;
		
		int [][] mCasos = new int [nCasosDeProva][];
		int [][] modes = new int [nCasosDeProva][10];
		
		//Creem els arrays i emplenem els arrays
		
		while(casosFets <= nCasosDeProva - 1) {
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
		
		while (modesFetes <= nCasosDeProva - 1) {
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
		int [][] modesOrdenades = new int [nCasosDeProva][10];

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


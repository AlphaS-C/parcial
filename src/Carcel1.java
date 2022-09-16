
public class Carcel1 {

	public char [][] prision = {
			{' ','P','X',' ','P','P',' ','P'},
			{' ','P','P',' ','P','P',' ','P'},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{'P',' ','P','P',' ','P',' ',' '},
			{'P',' ','X','P',' ','P','P',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{'P','X','P',' ','P','P',' ','P'}
	};
	
	public int x_entrada;
	public int y_entrada;
	
	public static void main(String[] args) {
		Carcel1 m = new Carcel1();
		m.resuelve(0,0,23);
	}
	
	public void resuelve(int x, int y, int cantPrisioneros) {
		int prisionerosExistentes = paso(x,y);
		System.out.println("Cantidad esperada " + cantPrisioneros);
		System.out.println("Cantidad esperada: " +prisionerosExistentes);
		if (cantPrisioneros > prisionerosExistentes) {
			System.out.println("se escaparon prisioneros");
		}
		else if (cantPrisioneros == prisionerosExistentes) {
			System.out.println("los prisioneros estan completos");
		}
		else {
			System.out.println("la cantiad de prisioneres existentes es mayor a la esperada");
		}
		System.out.println("se escaparon "+ (cantPrisioneros-prisionerosExistentes)+ " prisioneros");
	} 
	
	
	private int paso (int x,int y) {
		try {
			char casilla = prision[x][y];
			
			if (casilla =='P' || casilla == 'X' || casilla =='*' || casilla == 'p' ) {
				if (casilla == 'P') {
					prision[x][y] = 'p';
					return 1; 
			} return 0;
			}
			else {
				prision[x][y] = '*';
			}
	} 
	catch (Exception e) {
		return 0;
	}
	int suma = paso(x, y+1) + paso(x-1, y) + paso(x, y-1)+paso(x+1,y);
	prision[x][y]=' ';
	return suma;
}
}
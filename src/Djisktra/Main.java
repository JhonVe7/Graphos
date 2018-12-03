 package Djisktra;
 
public class Main {
	//matriz de cosotos 
	private int matrixCosts [][];
	//ultimo vertice visitado antes de destino 
	private int last [];
	//costos minimos de cada vertice
	private int vertexCost [];
	//marca los vertices visitados 
	private boolean check[];
	private int origin,vertex;
	
	public Main(int or) {
		vertex = 0 ;
		this.origin = or;
		matrixCosts = new int  [0][0];
		last = new int [vertex];
		vertexCost = new int[vertex];
		check = new boolean[vertex];
	}
	
	public void caminoMinimo() {
		// valores iniciales
		for (int i = 0; i < vertex; i++) {
			check[i] = false; // inicializa vertices como no visitados
			vertexCost[i] = matrixCosts[origin][i]; // pesos directos desde el origen hasta todos los posibles destinos
			last[i] = origin;
		}
		
		check[origin] = true;
		vertexCost[origin] = 0;
			
		//pasos para marcar los n-1 vertices 
		for (int i = 0; i < vertex; i++) {
			
			int v = minimo() ; // selecciona vertice no marcado de menor distancia
			check[v] = true;
			
			// actualiza distancia de vertices no marcados
			
			for (int j = 0; j < check.length; j++) {
				if (!check[j]) {
					if (vertexCost[v]+matrixCosts[v][j]< vertexCost[j] ) {
						vertexCost[v] = vertexCost[v] +matrixCosts[v][j];
						last[j] =v;
					}
				}
			}
			
		}
		
		for (int i = 0; i < vertex; i++) {
			System.out.println("costo minimo a " + i+": "+vertexCost[i]);
		}
	
	}
	
	public int minimo() {
		int mx = Grafo.inf;
		int v = 1;
		for (int i = 0; i < vertex; i++) {
			if(!check[i]&&( vertexCost[i] <= mx)) {
				mx = vertexCost[i];
				v = i;
			}
		}
		return v;
	}
	private int [][] insMatriz(Grafo<Integer> g) throws Limite Exceptions{
		int t = g.ordenGrafo(); 
		matrixCosts = new int [t][t];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				
			}
		}
	}
}
 
package Djisktra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DijkstraAlgorithm {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int E, origen, destino, peso, inicial, V;
		try {
			System.out.print("Ingrese el numero de vertices: ");
			V = Integer.parseInt(br.readLine());
			System.out.print("Ingrese el numero de aristas: ");
			E = Integer.parseInt(br.readLine());
			Dijkstra dijkstraAlgorithm = new Dijkstra(V);
			for (int i = 0; i < E; ++i) {
				System.out.print("----------------------------------\n");
				System.out.print("Ingrese el órigen número \"" + (i + 1) + "\": ");
				origen = Integer.parseInt(br.readLine());
				System.out.print("Ingrese el destino número: \"" + (i + 1) + "\": ");
				destino = Integer.parseInt(br.readLine());
				System.out.print("Ingrese el peso número: \"" + (i + 1) + "\": ");
				peso = Integer.parseInt(br.readLine());
				System.out.print("----------------------------------\n");
				dijkstraAlgorithm.addEdge(origen, destino, peso, true);
			}
			System.out.print("Ingrese el vertice inicial: ");
			inicial = Integer.parseInt(br.readLine());
			dijkstraAlgorithm.dijkstra(inicial);
			dijkstraAlgorithm.printShortestPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
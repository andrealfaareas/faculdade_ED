package organizadorDeVetores;

public class Testando {

	public static void main(String[] args) {
		GeradorDeVetores GV = new GeradorDeVetores(10000);
		
		GV.popularVetorDeFormaInvertida();
		
		System.out.println(GV);
		
		long tempoInicial = System.currentTimeMillis();
		
		OrganizadorQuickSort.OrganizarVetor(GV.getVetor());
		
		long tempoFinal = System.currentTimeMillis();
        
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		
		System.out.println(GV);
		
	}

}

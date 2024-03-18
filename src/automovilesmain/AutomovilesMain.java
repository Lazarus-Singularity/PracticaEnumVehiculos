
package automovilesmain;


public class AutomovilesMain {

	
	public static void main(String[] args) {
		
		Automovil carro = new Automovil ("Ford", 2010, 50, tipoCom.GASOLINA, tipoA.EJECUTIVO, 4, 4, 250, tipoColor.ROJO);
		
		carro.imprimir();
		
	}
	
}

package comunicacion;

public class Fabula extends Escrito {
	protected String ensenanza;
	protected String interpretacion;
	
	// constructor
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	// getters  and  setters
	
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	// Metodos de la clase abstracta heredada
	
	@Override
	
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas()*palabrasPagina;
		}
	
	@Override
	public String interpretacion() {
		return interpretacion;
}
	@Override
	
	public String toString() {
		String res =  this.resumen() + "\n";
		res += this.ensenanza;
		return res;
				
				
	}
	
}
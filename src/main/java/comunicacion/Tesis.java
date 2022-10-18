package comunicacion;


public class Tesis extends Escrito{
	private String idea;
	private String argumentos[];
	private String conclusion;
	private String referencias;
	private String interpretacion;

	// constructor

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	// metodos de la  clase padre

	@Override
	
	public int palabrasTotales(int palabrasPagina) {
		return 5*super.getPaginas()*palabrasPagina;
	}
	
	@Override
	
	public String interpretacion() {
		return  interpretacion;
	}
	public String toString() {
		String res =  this.resumen() + "\n";
		res += this.idea + "\n";
		res += this.argumentos.length + "\n";
		res += this.conclusion + "\n";
		res += this.referencias;
		return res;

	}

	// getters  and setters

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return this.argumentos;
	}
	public int cantidadArgumentos() {
		return this.argumentos.length;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


}
package entities;

public class Individual extends Contribuinte {
	
	private Double despesasSaude;
	
	
	public Individual(){
		super();
	}

	public Individual(String name, Double rendaAnual, Double despesasSaude) {
		super(name, rendaAnual);
		this.despesasSaude = despesasSaude;
	}

	public Double getDespesasSaude() {
		return despesasSaude;
	}

	public void setDespesasSaude(Double despesasSaude) {
		this.despesasSaude = despesasSaude;
	} 
	
	
	@Override
	public Double tax() {
		if(getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - despesasSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesasSaude * 0.5;
		}
	}
	
	
	
	

}

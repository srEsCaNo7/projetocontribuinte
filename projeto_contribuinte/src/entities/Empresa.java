package entities;

public class Empresa extends Contribuinte{
	
	private Integer numeroDeFuncionarios;
	
	
	public Empresa(){
		super();
	}

	public Empresa(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double tax() {
		if(numeroDeFuncionarios < 10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}
	
	
	
	

}

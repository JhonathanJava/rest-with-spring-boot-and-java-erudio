package br.com.erudio;

public class Greeting {

	private Long codigo;
	private String name;
	
	public Greeting(String name, Long codigo) {
		this.name = name;
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	
}

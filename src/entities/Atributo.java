package entities;

public class Atributo {
	private String nome;
	private Integer valor;
	private Integer modificador;

	public Atributo(String nome, Integer valor, Integer modificador) {
		this.nome = nome;
		this.valor = valor;
		this.modificador = modificador;
	}

	@Override
	public String toString() {
		return valor.toString();
	}

}

package entities;

import java.util.ArrayList;
import java.util.List;

public class Caracter {
	protected String name;
	protected String atributoBonus;
	protected List<Atributo> atributos;

	public Caracter(String name) {
		this.name = name;
		this.atributos = new ArrayList<Atributo>();
	}

	@Override
	public String toString() {
		return "Minha classe é " + this.getClass().getSimpleName() + " meu atributo com bônus é " + atributoBonus + " -> " + this.atributos.get(Attributes.getIndex(atributoBonus));
	}

	public List<Atributo> getAtributos() {
		return atributos;
	}
	
	public String getBonus() {
		return atributoBonus;
	}

	public void printName() {
		System.out.println("Nome: " + name);
	}
	
}

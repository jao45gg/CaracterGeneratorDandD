package application;

import java.util.Hashtable;
import java.util.Scanner;

import entities.Barbaro;
import entities.Bardo;
import entities.Caracter;
import entities.Guerreiro;
import entities.Ladino;
import entities.Mago;
import entities.Monge;
import services.GenerateAttributes;
import services.GenerateRandomNum;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		Hashtable<Integer, Caracter> MYHASH = new Hashtable<Integer, Caracter>() {

			private static final long serialVersionUID = 1L;

			{
				put(1, new Guerreiro(name));
				put(2, new Ladino(name));
				put(3, new Barbaro(name));
				put(4, new Mago(name));
				put(5, new Monge(name));
				put(6, new Bardo(name));
			}
		};

		Caracter personagem = MYHASH.get(GenerateRandomNum.generate());
		personagem.printName();
		GenerateAttributes.generateAttributes(personagem.getAtributos(), personagem.getBonus());
		System.out.println(personagem);
		System.out.println("\n");
		
		Caracter personagem1 = new Guerreiro("Cassiano");
		personagem1.printName();
		GenerateAttributes.generateAttributes(personagem1.getAtributos(), personagem1.getBonus());
		System.out.println(personagem1);
		System.out.println("\n");
		
		Caracter personagem2 = new Ladino("Otávio");
		personagem2.printName();
		GenerateAttributes.generateAttributes(personagem2.getAtributos(), personagem2.getBonus());
		System.out.println(personagem2);
		System.out.println("\n");

		Caracter personagem3 = new Barbaro("Pedro");
		personagem3.printName();
		GenerateAttributes.generateAttributes(personagem3.getAtributos(), personagem3.getBonus());
		System.out.println(personagem3);
		System.out.println("\n");
		
		Caracter personagem4 = new Mago("Hiago");
		personagem4.printName();
		GenerateAttributes.generateAttributes(personagem4.getAtributos(), personagem4.getBonus());
		System.out.println(personagem4);
		System.out.println("\n");
		
		Caracter personagem5 = new Monge("Diego");
		personagem5.printName();
		GenerateAttributes.generateAttributes(personagem5.getAtributos(), personagem5.getBonus());
		System.out.println(personagem5);
		System.out.println("\n");
		
		Caracter personagem6 = new Bardo("Júnio");
		personagem6.printName();
		GenerateAttributes.generateAttributes(personagem6.getAtributos(), personagem6.getBonus());
		System.out.println(personagem6);
		System.out.println("\n");

		sc.close();
	}

}

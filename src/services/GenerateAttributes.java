package services;

import java.util.ArrayList;
import java.util.List;

import entities.Atributo;
import entities.Attributes;

public class GenerateAttributes {

	private final static int bonus = 2;

	public static void generateAttributes(List<Atributo> atributos, String atributoBonus) {
		for (int i = 0; i < 6; i++) {
			String attributeName = Attributes.getAttributeName(i);
			ArrayList<Integer> diceRools = DiceOperations.generateDiceRools();
			int total = DiceOperations.calculateTotal(diceRools);
			if (atributoBonus == attributeName)
				total += bonus;
			atributos.add(new Atributo(attributeName, total, bonus));

			System.out.println(String.format("%s: %d, %d, %d, %d -> %d", attributeName, diceRools.get(0),
					diceRools.get(1), diceRools.get(2), diceRools.get(3), total));
		}
	}

}

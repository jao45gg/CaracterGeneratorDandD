package services;

import java.util.ArrayList;
import java.util.Comparator;

public class DiceOperations {

	static ArrayList<Integer> generateDiceRools() {
		ArrayList<Integer> dices = new ArrayList<Integer>();
		
		for (int j = 0; j < 4; j++) {
			dices.add(GenerateRandomNum.generate());
		}
		
		dices.sort(Comparator.naturalOrder());
		return dices;
	}
 
	static int calculateTotal(ArrayList<Integer> dices) {
		int j2 = 1;
		if (dices.get(0) == dices.get(1)) {
			j2 = 2;
		}
		int value = 0;
		for (int j3 = j2; j3 < dices.size(); j3++) {
			value += dices.get(j3);
		}

		return value;
	}


}

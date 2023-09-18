package entities;

public enum Attributes {
    Força,
    Destreza,
    Constituição,
    Inteligência,
    Sabedoria,
    Carisma;

    // Method to get the string value based on numerical index
    public static String getAttributeName(int index) {
        if (index >= 0 && index < values().length) {
            return values()[index].toString();
        }
        return null; // Handle out-of-bounds index
    }
    
    public static int getIndex(String name) {
    	for (int i = 0; i < values().length; i++) {
			if(values()[i].toString() == name)
				return i;
		}
    	return -1;
    }
}

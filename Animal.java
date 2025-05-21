package DAY18;

public interface Animal {
    String CATEGORY = "Living Being"; // Constant

    static boolean isMammal(String animalName) { // Static method
        return animalName.equals("Dog") || animalName.equals("Cat") || animalName.equals("Human");
    }

    default void speak() { // Default method
        System.out.println("Animal is making a sound.");
    }

    void move(); // Abstract method
}




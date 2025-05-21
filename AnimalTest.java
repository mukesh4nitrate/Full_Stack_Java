package DAY18;


public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("Dog Behavior:");
        dog.move();
        dog.speak();
        System.out.println("Is Dog a mammal? " + Animal.isMammal("Dog"));
        System.out.println("Category: " + Animal.CATEGORY);

        System.out.println("\nBird Behavior:");
        bird.move();
        bird.speak();
        System.out.println("Is Bird a mammal? " + Animal.isMammal("Bird"));
        System.out.println("Category: " + Animal.CATEGORY);
    }
}

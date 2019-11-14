package Inheritance.Animal_Fruit_Edible;

public class Chicken extends Animal implements IEdible{
    @Override
    String makeSound() {
        return "Chicken: cluck-cluck !";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

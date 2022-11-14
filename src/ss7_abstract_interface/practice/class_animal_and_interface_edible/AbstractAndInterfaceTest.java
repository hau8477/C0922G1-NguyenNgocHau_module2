package ss7_abstract_interface.practice.class_animal_and_interface_edible;

import ss7_abstract_interface.practice.class_animal_and_interface_edible.animal.Animal;
import ss7_abstract_interface.practice.class_animal_and_interface_edible.animal.Chicken;
import ss7_abstract_interface.practice.class_animal_and_interface_edible.animal.Tiger;
import ss7_abstract_interface.practice.class_animal_and_interface_edible.edible.Edible;
import ss7_abstract_interface.practice.class_animal_and_interface_edible.fruit.Apple;
import ss7_abstract_interface.practice.class_animal_and_interface_edible.fruit.Fruit;
import ss7_abstract_interface.practice.class_animal_and_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }


        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruits : fruit) {
            System.out.println(fruits.howToEat());
        }
    }
}

/*Create a base class Animal with a method makeSound(). Then, create two
subclasses Dog and Cat that override the makeSound() method to print "Bark" and
"Meow", respectively. Write a program that creates objects of both Dog and Cat and
calls the makeSound() method.
 */

 class Animal {
    public void makeSound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}

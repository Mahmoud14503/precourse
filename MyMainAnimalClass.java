public class MyMainAnimalClass {
    public static void main(String[] args) {
        Animal generalAnima = new Animal();
        generalAnima.makeSound();
        Lion lion = new Lion();
        lion.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}

class Animal {
    String sound;
    String food;
    String name;
    String specie;
    int age;
    String clothes;
    String owner;

    void eat() {
        System.out.println("eating food...");
    }
    void makeSound() {
        System.out.println("making sound...");
    }
}

class Lion extends Animal {
    void makeSound() {
        System.out.println("make lion sound...");
    }
}

class Dog extends Animal {

}

class Cat extends Animal {
    void makeSound() {
        System.out.println("make cat sound...");
    }
}

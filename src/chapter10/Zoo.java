package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
        feed(sasha);

        //sasha does not have the method scratch because belong to Animal class and the method scratch to cat
    }

    public static void feed(Animal animal) {
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here's your Cat food");
        }

    }
}

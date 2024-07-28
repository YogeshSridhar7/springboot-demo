public class Animal {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Dog dog = new Dog();
        dog.eat();
    }
    private String name="Animal";
    {
        name = "init animal";
        System.out.println("init block parent " + name);
    }
    static {
        String name = "Static Animal";
        System.out.println("static block parent " + name);
    }
    Animal(){
        System.out.println("Animal default constructor");
    }
    Animal(String name){
        this.name=name;
        System.out.println("One arg constructor of Animal : " + name);
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    private String name="Dog";
    {
        name = "init dog";
        System.out.println("init block " + name);
    }
    static {
        String name = "Static Dog";
        System.out.println("static block " + name);
    }
    Dog(){
        System.out.println("Dog default constructor");
    }
    Dog(String name){
        super(name);
        this.name=name;
        System.out.println("One arg constructor of Dog : " + name);
    }
    public void eat(){
        System.out.println("Dog eats");
    }
}
interface Animal {
    public static final String tname = "Hello";
    void speed();
    void name(String tname);
    default void show(){
        System.out.println("This is the Default Method of Animal.");
    }
}

interface FastAnimal {
    void run(int a);
    default void show(){
        System.out.println("This is Default Method of FastAnimal.");
    }
    static void roar() {
        System.out.println("This is a Static Method of FastAnimal.");
    }
}

class Lion implements Animal, FastAnimal {
    @Override
    public void speed() {
        System.out.println("I am Fast");
    }
    public void show() {
        Animal.super.show();
        FastAnimal.super.show();
    }
    @Override
    public void run(int a) {
        System.out.println("I run at speed of "+a);
    }
    @Override
    public void name(String tname) {
        System.out.print("My name is " + tname);
    }
    
}

public class Interface {
    public static void main(String[] args) {
        Lion mufasa = new Lion();
        mufasa.speed();
        mufasa.show();
        mufasa.run(270);
        mufasa.name("Mufasa");
    }
}

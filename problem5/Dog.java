class Dog extends Animal {
    String sound;

    Dog(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    void bark() {
        System.out.println("Sound: " + sound);
    }

    void display() {
        super.show(); // using super to call the show() method of the parent class
        this.bark(); // using this to call the bark() method of the current class
    }
}
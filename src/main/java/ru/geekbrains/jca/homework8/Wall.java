package ru.geekbrains.jca.homework8;

public class Wall{
    private String name;

    public Wall(String name) {
        this.name = name;
    }

    public void climb(Moveable moveable) {
        System.out.println("The wall: " + this.name);
        moveable.jump();
        System.out.println("climb success");
    }
}

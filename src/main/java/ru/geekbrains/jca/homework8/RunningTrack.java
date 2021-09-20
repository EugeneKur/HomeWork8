package ru.geekbrains.jca.homework8;

public class RunningTrack{
    private String name;

    public RunningTrack (String name) {
        this.name = name;
    }

    public void runningOnTrack(Moveable moveable) {
        System.out.println("The RunningTrack: " + this.name);
        moveable.run();
        System.out.println("run on the runningTrack success");
    }
}

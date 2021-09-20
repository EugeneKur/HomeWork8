package ru.geekbrains.jca.homework8;

public class Homework8 {
    public static void main(String[] args) {
//        Moveable human = new Human("Dima");
//        Moveable cat = new Cat();
//        Moveable robot = new Robot();
//
//       human.jump();
//        human.run();
//        cat.jump();
//        cat.run();
//        robot.jump();
//        robot.run();
//
//        System.out.println("\n");




        Moveable[] moveables = {
                new Human("Ivan"),
                new Cat("Murka"),
                new Robot("Robocop")
        };

        for (Moveable moveable : moveables) {
            moveable.jump();
            moveable.run();
        }

        System.out.println("\n");

        Wall[] walls = {
                new Wall("Wall 1"),
                new Wall("Wall 2"),
                new Wall("Wall 3")
        };


        for (int i = 0; i < walls.length; i++) {
            walls[i].climb(moveables[i]);
        }

        RunningTrack[] runningTracks = {
                new RunningTrack("RunningTrack 1"),
                new RunningTrack("RunningTrack 2"),
                new RunningTrack("RunningTrack 3"),
        };


        for (int i = 0; i < walls.length; i++) {
            runningTracks[i].runningOnTrack(moveables[i]);
        }



    }
}

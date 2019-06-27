package com.javarush.task.task25.task2515;

public class SpaceShip extends BaseObject {

    private double dx = 0;

    public SpaceShip(double x, double y) {
        super(x, y, 3);
    }

    public void moveLeft(){
        dx = -1;
    }

    public void moveRight(){
        dx = 1;
    }

    public void move(){
        x += dx;
        checkBorders(0 + 2 * radius, Space.game.getWidth() - 2 * radius, 0, Space.game.getHeight());
    }

    public void draw(Canvas canvas){

    }

    /** Этот метод вызывается, когда надо произвести выстрел */
    public void fire(){
        Space.game.getRockets().add(new Rocket(x - 2, y));
        Space.game.getRockets().add(new Rocket(x + 2, y));
    }
}

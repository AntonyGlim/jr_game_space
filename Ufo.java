package com.javarush.task.task25.task2515;

public class Ufo extends BaseObject {
    public Ufo(double x, double y) {
        super(x, y, 3);
    }

    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
    };

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'U');
    }

    @Override
    public void move() {
        x = x + Math.random() * 2 - 1;
        y = y + Math.random() * 2 - 1;

        checkBorders(radius, Space.game.getWidth() - radius + 1, 1, Space.game.getHeight() / 2);

        double random = Math.random();
        if (random >= 0 && random <= 0.1) {
            this.fire();
        }
    }

    public void fire() {
        Space.game.getBombs().add(new Bomb(x, y + radius));
    }
}
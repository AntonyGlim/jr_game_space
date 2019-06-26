package com.javarush.task.task25.task2515;

/**
 * Он будет ответственным за "отрисовку" объектов.
 * С его помощью они будут отрисовывать себя.
 * Вернее даже на нем.
 */
public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height][width];
    }



    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
